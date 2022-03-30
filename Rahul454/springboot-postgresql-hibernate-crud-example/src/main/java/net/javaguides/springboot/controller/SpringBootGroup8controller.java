package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.dao.Spring8Dao;
import net.javaguides.springboot.model.Employee;

@RestController
public class SpringBootGroup8controller {
	@Autowired
	Spring8Dao dao;

	@GetMapping("/helloworld")
	public String getHelloworld() {

		return "Hello World";
	}

	@PostMapping("/helloworld")
	public String postHelloworld(@RequestBody Employee user) {

		Employee user2 = dao.postMessage(user);
		return user2.getMessage();
	}
	
	@PutMapping("/helloworld")
	public String putHelloworld(@RequestBody Employee user) {

		Employee user2 = dao.postMessage(user);
		return user2.getMessage();
	}

}
