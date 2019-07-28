package com.scale.handler.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scale.handler.entites.Group;
import com.scale.handler.repo.GroupRepository;

@Service
public class GroupService {
	
	@Autowired
	private GroupRepository groupRepository;
	
	public List<Group> getAllGroup(){
		List<Group> groupList = new ArrayList<Group>();
		groupRepository.findAll().forEach(e -> groupList.add(e));
		return groupList;
	}
	
	public Group getGroup(int id) {
		return groupRepository.findById(id).get();
	}
	
	public void createGroup(Group group) {
		groupRepository.save(group);
	}
	
	public void updateGroup(Group group) {
		groupRepository.save(group);
	}
	
	public void deleteGroup(int id) {
		groupRepository.deleteById(id);
	}
}
