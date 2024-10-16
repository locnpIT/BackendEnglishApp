package com.example.project.Service;

import java.util.Optional;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.project.Config.jwtProvider;
import com.example.project.DTO.RegisterDTO;
import com.example.project.Models.User;
import com.example.project.Repository.UserRepository;
import com.example.project.Request.LoginRequest;
import com.example.project.Response.AuthResponse;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	private final PasswordEncoder passwordEncoder;
	
	private final CustomUserDetailsService customUserDetailsService;
	
	public UserService(UserRepository userRepository, 
			PasswordEncoder passwordEncoder, 
			CustomUserDetailsService customUserDetailsService) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.customUserDetailsService = customUserDetailsService;
		
	}
	
	public User findUserById(Long id) throws Exception{
		Optional<User> optUser = this.userRepository.findById(id);
		if(!optUser.isPresent()) {
			throw new Exception("User cannot found!");
		}
		return optUser.get();
	}
	
	public User saveUser(User user) {
		return this.userRepository.save(user);
	}
	
	public User isEmailIsExist(String email) {
		return this.userRepository.findByEmail(email);
	}
	
	public AuthResponse registerUser(RegisterDTO reqUser) throws Exception{
		
		User createUser = new User();
		createUser.setEmail(reqUser.getEmail());
		if(!reqUser.getConfirmPassword().equals(reqUser.getPassword()))
			throw new Exception("Password confirm is incorrect!");
		if(isEmailIsExist(reqUser.getEmail()) != null)
			throw new Exception("This email already used with another account");
		
		
		String hashPassword = passwordEncoder.encode(reqUser.getPassword());
		
		createUser.setPassword(hashPassword);
		createUser.setFirstName(reqUser.getFirstName());
		createUser.setLastName(reqUser.getLastName());
		createUser = this.userRepository.save(createUser);
		
		Authentication authentication = new UsernamePasswordAuthenticationToken(createUser.getEmail(), createUser.getPassword());
		
		String token  = jwtProvider.generateToken(authentication);
		
		AuthResponse authResponse = new AuthResponse(token, "Register sucess!");
		
		return authResponse;
		
	}
	
	
	public AuthResponse loginUser(LoginRequest loginRequest) {
		
		Authentication authentication = 
				authenticate(loginRequest.getEmail(), loginRequest.getPassword());
		
		String token = jwtProvider.generateToken(authentication);
		AuthResponse authResponse = new AuthResponse(token, "Login success!");
		
		return authResponse;
		
	}
	
	private Authentication authenticate(String email, String password) {
		
		UserDetails userDetails = customUserDetailsService.loadUserByUsername(email);
		
		if(userDetails == null) {
			throw new BadCredentialsException("Invalid username");
		}
		if(!passwordEncoder.matches(password, userDetails.getPassword())) {
			throw new BadCredentialsException("Password is wrong!");
		}
		
		return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
	}
	
	
	public User findUserByJwt(String jwt) {
		String email = jwtProvider.getEmailFromJwtToken(jwt);
		
		User user = this.userRepository.findByEmail(email);
		return user;
	}
	
}
