package com.i3tv.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Integer id) throws UserNotFounException{
		return userService.read(id);
		
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) throws UserNotFounException{
		userService.delete(id);
	}
	
	@PostMapping()
	public void create(@RequestBody User user) throws UserNotFounException{
		userService.create(user);
	}
	
	@PutMapping()
	public void update(@RequestBody User user) throws UserNotFounException{
		userService.update(user);
	}
}
