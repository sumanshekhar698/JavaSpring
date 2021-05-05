package com.infy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//mvc controller
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping
//	public @ResponseBody String sample()
	public @ResponseBody String sample()
//	public String sample()
	{
		System.out.println("REACHED");
		return "PleaseWork";
	}
}
