package com.example.project.Service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.project.DTO.RegisterDTO;
import com.example.project.Models.User;
import com.example.project.Repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	private final PasswordEncoder passwordEncoder;
	
	public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
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
	
	public User registerUser(RegisterDTO reqUser) throws Exception{
		
		User createUser = new User();
		createUser.setEmail(reqUser.getEmail());
		if(!reqUser.getConfirmPassword().equals(reqUser.getPassword()))
			throw new Exception("Password confirm is incorrect!");
		String hashPassword = passwordEncoder.encode(reqUser.getPassword());
		
		createUser.setPassword(hashPassword);
		createUser.setFirstName(reqUser.getFirstName());
		createUser.setLastName(reqUser.getLastName());
		createUser = this.userRepository.save(createUser);
		return createUser;
	}
	
}
