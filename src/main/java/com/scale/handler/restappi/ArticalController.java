package com.scale.handler.restappi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scale.handler.entites.Artical;
import com.scale.handler.services.ArticalService;

@RestController
@RequestMapping("/articals")
public class ArticalController {
	
	@Autowired
	private ArticalService service;
	
	@GetMapping
	public List<Artical> getAllArticals(){
		return service.getAllArtical();	
	}
	
	@GetMapping("{id}")
	public Artical getArtical(@PathVariable Integer id) {
		return service.getArtical(id);
		
	}
	@PostMapping
	public void createArtical(@RequestBody Artical artical) {
		service.createArtical(artical);
	}
	
	@PutMapping
	public void updateArtical(@RequestBody Artical artical) {
		service.updateArtical(artical);
	}
	
	@DeleteMapping("{id}")
	public void deleteArtical(@PathVariable Integer id ) {
		service.deleteArtical(id);
	}
	
	
}
