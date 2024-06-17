package com.example.demo.animalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.animalsAPI.data.AnimalsAPIData;
import com.example.demo.animalsAPI.service.AnimalsAPIService;

import jakarta.servlet.http.HttpServlet;

@Controller
public class AnimalsAPIController extends HttpServlet {
	private final AnimalsAPIService AnimalsAPIService;

	public AnimalsAPIController(AnimalsAPIService AnimalsAPIService) {
		this.AnimalsAPIService = AnimalsAPIService;
	}

	@GetMapping("AnimalsAPI")
	public String getPets(Model model) throws IOException {

		List<AnimalsAPIData> animalsList = AnimalsAPIService.getAnimals();

		model.addAttribute("animalsList", animalsList);

		return "AnimalsAPI.html";

	}

}