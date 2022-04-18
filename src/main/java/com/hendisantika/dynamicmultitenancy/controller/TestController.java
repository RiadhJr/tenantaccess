package com.hendisantika.dynamicmultitenancy.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/tenant")
	@PreAuthorize("hasRole('ROLE_TENANT')")
	public String tenantAccess() {
		return "tenant Content.";
	}

	@GetMapping("/gerant")
	@PreAuthorize("hasRole('ROLE_GERANT')")
	public String gerantAccess() {
		return "gerant  Board.";
	}

	@GetMapping("/employee")
	@PreAuthorize("hasRole('ROLE_EMPLOYEE')")
	public String employeeAccess() {
		return "employee Board.";
	}
}
