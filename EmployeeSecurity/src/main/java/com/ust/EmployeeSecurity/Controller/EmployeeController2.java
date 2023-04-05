package com.ust.EmployeeSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/noauth")
public class EmployeeController2 {
	@GetMapping("/goodmorning")
	public String greeting() {
		return "hi meera good morning";
	}

}



