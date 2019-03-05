package com.webservice.consumption.webserviceconsumption.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.webservice.consumption.webserviceconsumption.dto.UserDtoFromServer;
import com.webservice.consumption.webserviceconsumption.model.User;
import com.webservice.consumption.webserviceconsumption.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@Autowired
	private UserRepository userRepository;

	public UserDtoFromServer getUserDetails()
	{
		RestTemplate restTemplate = restTemplateBuilder.build();
		UserDtoFromServer userDtoServ = restTemplate.getForObject("http://localhost:9001/getusers", UserDtoFromServer.class);
		User user = new User();
		user.setRollno(userDtoServ.getRollno());
		user.setAddress(userDtoServ.getAddress());
		user.setUsername(userDtoServ.getUsername());
		userRepository.save(user);
		return userDtoServ;
		
	}
	
}
