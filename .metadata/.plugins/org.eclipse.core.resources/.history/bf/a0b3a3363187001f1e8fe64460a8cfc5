package com.example.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.project.Models.Vocabulary;
import com.example.project.Repository.VocabularyRepository;

@Service
public class VocabularyService {
	private final VocabularyRepository vocabularyRepository;

	public VocabularyService(VocabularyRepository vocabularyRepository) {
		this.vocabularyRepository = vocabularyRepository;
	}

	public List<Vocabulary> findAll() {
		return this.vocabularyRepository.findAll();
	}

	public Vocabulary findVocabularyById(Long id) throws Exception {
		Optional<Vocabulary> optVoca = this.vocabularyRepository.findById(id);
		if (!optVoca.isPresent()) {
			throw new Exception("Cannot find this vocabulary");
		}

		return this.vocabularyRepository.findById(id).get();
	}

}
