package com.ty.boot.springboot_trainer_demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	
	@PostMapping("/print")
	public String print()
	{
		return "nanu printu";
	}
	
	@PostMapping("/hello")
	public void hello()
	{
		System.out.println("hello");
	}

}
