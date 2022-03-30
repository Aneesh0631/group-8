package net.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/myFirstAPI")
	public String myFirstAPI() {
		return "Hello World ! API test Successful";
	}
	

}
