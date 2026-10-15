package edu.ifsp.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingsControntroller {
	
	@GetMapping("/greentings")
	public String sayHello(@RequestParam(value="name") String name){
		return "Hello "+name;
	}
}
