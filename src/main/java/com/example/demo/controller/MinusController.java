package com.example.demo.controller;

import org.springframework.ui.Model;

@controller

public class MinusController {
	
	@autowired
	private calculationservice calculationservice;
	
	@getmapping("minus")
	public string index() {
		return "index";
	}
	
	@postmapping("inuscalate")
	public string calculate(@requestparam("number") int number, Model model) {
		int result = calculationservice.calculate();
		model.addAttribute("result", result);
		return "index";
	}

}
