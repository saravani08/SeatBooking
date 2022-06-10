package com.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersDAO extends CrudRepository<Users,Integer>{

	Optional<Users> findByUserName(String userName);
	
	

	
}
