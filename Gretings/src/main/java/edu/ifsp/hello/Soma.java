package edu.ifsp.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Soma {
	@GetMapping("/soma")
	public int socorro(@RequestParam(value="num1") int num1,@RequestParam(value="num2") int num2){
		int res = num1+num2;
		return res;
	}
}
