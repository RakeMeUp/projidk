package com.rake.homeproject.service;
import com.rake.homeproject.model.UserDTO;
import com.rake.homeproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<UserDTO> getUsers() {
		return userRepository.findAll();
	}

	public UserDTO addUser(UserDTO user){
		return userRepository.save(user);
	}
}