package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.component.User;


@RestController
@RequestMapping("/request")
public class HelloRestController{
	
	//localhost:8080/request/wish
	@RequestMapping(value={"/wish","/",""})
	public String wish() {
		return "Hello World";
	}
	
	@RequestMapping(value= {"/param"},method=RequestMethod.GET)
	public String sayHello(@RequestParam("key") String value) {
		return "Hello "+value;
	}
	
	@RequestMapping(value= {"/path/{name}"},method=RequestMethod.GET)
	public String syaHi(@PathVariable("name") String name) {
		return "Hello "+name;
	}
	
//	@PostMapping
	@RequestMapping(value= {"/post"},method=RequestMethod.POST)
	public String sayWow(@RequestBody User user) {
		return "Hello "+user.firstName+" "+user.lastName;
	}
	
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,@RequestParam ("lastName") String lastName) {
		return "Hello "+firstName+" "+lastName;
	}
}













