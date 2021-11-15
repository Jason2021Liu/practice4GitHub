package com.avanade.learningService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenefitController {

	@GetMapping("/getBenefit")
	public String getBenefit() {

		return "just a test for get Benefit";
	}
}
