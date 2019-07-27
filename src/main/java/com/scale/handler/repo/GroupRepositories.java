package com.scale.handler.repo;

import org.springframework.data.repository.CrudRepository;

import com.scale.handler.entites.Group;

public interface GroupRepositories extends CrudRepository<Group, Integer>{
	
}
