package com.webservice.consumption.webserviceconsumption.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.consumption.webserviceconsumption.dto.UserDtoFromServer;
import com.webservice.consumption.webserviceconsumption.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getusers")
	public UserDtoFromServer getUserDetails()
	{
		UserDtoFromServer userDtoFromServer = userService.getUserDetails();
		return userDtoFromServer;
	}
	

}
