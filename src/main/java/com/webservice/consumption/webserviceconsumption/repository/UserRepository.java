package com.webservice.consumption.webserviceconsumption.repository;

import org.springframework.data.repository.CrudRepository;

import com.webservice.consumption.webserviceconsumption.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
