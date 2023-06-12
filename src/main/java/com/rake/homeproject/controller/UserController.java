package com.rake.homeproject.controller;

import com.rake.homeproject.model.UserDTO;
import com.rake.homeproject.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> getUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
	}

	@PostMapping("/users")
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO user) {
		UserDTO createdUser = userService.addUser(user);
		return ResponseEntity.status(HttpStatus.OK).body(createdUser);
	}

}

