package com.user.registration.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.registration.api.dto.UserDTO;
import com.user.registration.api.service.UserService;

@RestController
@RequestMapping("/registrations")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public UserDTO createUser(@RequestBody UserDTO userDTO) {
		int a=10;
		return this.userService.createUser(userDTO);
	}

}
