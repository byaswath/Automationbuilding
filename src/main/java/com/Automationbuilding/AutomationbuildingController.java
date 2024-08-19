package com.Automationbuilding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationbuildingController {
	
	@GetMapping(value = "/getThis")
	public String getThis() {
		return "2025 - I am Coming";
	}

}
