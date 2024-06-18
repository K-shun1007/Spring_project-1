package com.example.demo.animalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.AnimalsAPIData;
import com.example.demo.animalsAPI.repository.AnimalsAPIRepository;

@Service
public class AnimalsAPIService {
	private final AnimalsAPIRepository AnimalsAPIRepository;

	public AnimalsAPIService(AnimalsAPIRepository AnimalsAPIRepository) {
		this.AnimalsAPIRepository = AnimalsAPIRepository;
	}

	public List<AnimalsAPIData> getAnimals() throws IOException {

		AnimalsAPIData[] animalsList = AnimalsAPIRepository.getAnimals();

		return Arrays.asList(animalsList);

	}
	
	public AnimalsAPIData getAnimalDetail(int animalId) throws IOException {

		AnimalsAPIData animalDetail= AnimalsAPIRepository.getAnimalDetail(animalId);

		return animalDetail;

	}
}