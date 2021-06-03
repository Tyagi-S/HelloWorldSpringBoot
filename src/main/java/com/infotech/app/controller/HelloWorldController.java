package com.infotech.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.app.Name;



@RestController
public class HelloWorldController
{	
	@PostMapping(value="/")
	public String hello(@RequestBody Name person)
	{
		return "Hi I am "+person.getName()+person.getAge();
	}
	@GetMapping(value="/")
	public String hello1()
	{
		return "Hi I am Tyagi Singh!!";
	}
}
