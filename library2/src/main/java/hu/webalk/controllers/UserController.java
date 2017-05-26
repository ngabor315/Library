package hu.webalk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.webalk.entity.UserEntity;
import hu.webalk.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
	Iterable<UserEntity> list() {
		return userService.listAllUser();
	}
	
	@PostMapping(path = "", consumes=MediaType.APPLICATION_JSON_VALUE)
	void createNew(@RequestBody UserEntity newUser) {
		userService.newUser(newUser);
	}
	
	void deleteExisting(@PathVariable("id")long id) {
		userService.deleteUser(id);
	}
}
