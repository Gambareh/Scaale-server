package com.scale.handler.restappi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scale.handler.entites.Artical;
import com.scale.handler.entites.Group;
import com.scale.handler.services.GroupService;

@RestController
@RequestMapping("/groups")
public class GroupController {
	
	@Autowired
	private GroupService groupService;
	
	@GetMapping
	public ResponseEntity<List<Group>> getAllGroup(){
		List<Group> groupList = groupService.getAllGroup(); 
		return new ResponseEntity<List<Group>>(groupList,HttpStatus.OK);
	}
	
	@GetMapping({"id"})
	public Group getGroup(@PathVariable int id) {
		return groupService.getGroup(id);
	}
	
	@PostMapping
	public void createGroup(@RequestBody Group group) {
		groupService.createGroup(group);
	}
	
	@PutMapping
	public void updateGroup(@RequestBody Group group) {
		groupService.updateGroup(group);
	}
	
	@DeleteMapping
	public void deleteArtical(@PathVariable int id) {
		groupService.deleteGroup(id);
	}
	
}
