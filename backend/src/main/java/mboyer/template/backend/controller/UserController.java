package mboyer.template.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mboyer.template.backend.dto.UserDTO;
import mboyer.template.backend.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public UserDTO getUser(@PathVariable(value = "id") final Long id) {
		return userService.getUser(id);
	}
}
