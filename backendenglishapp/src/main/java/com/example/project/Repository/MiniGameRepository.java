package com.example.project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Models.MiniGame;
import java.util.List;


@Repository
public interface MiniGameRepository extends JpaRepository<MiniGame, Long> {
	
	Optional<MiniGame> findById(Long id);
	
}
