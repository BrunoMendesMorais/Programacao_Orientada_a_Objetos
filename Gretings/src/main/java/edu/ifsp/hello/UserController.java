package edu.ifsp.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
//	@Autowired
	private UserServices userService;
	
	public UserController(UserServices userService) {
		this.userService=userService;
	}
	
	@GetMapping
	public List getAllUsers(){
		return userService.getAllUsers();
	}
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	@PostMapping
	public User createUser(@RequestBody User user){
		return userService.createUser(user);
	}
	
	@PutMapping
	public User UpdateUser(@RequestBody User user) {  
		return userService.updateUser(user);
	}
	
	@DeleteMapping
	public User deleteUser(@RequestBody User user) {
		return userService.deleteUser(user);
	}
	
	@DeleteMapping("/rem/{id}")
	public User deleteUserById(@PathVariable int id) {
		return userService.deleteUserById(id);
	}
}
