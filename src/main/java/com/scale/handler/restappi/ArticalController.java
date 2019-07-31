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
import com.scale.handler.services.ArticalService;

@RestController
@RequestMapping("/articals")
public class ArticalController {
	
	@Autowired
	private ArticalService service;
	
	@GetMapping
	public ResponseEntity<List<Artical>> getAllArticals(){
		List<Artical> articalList = service.getAllArtical();
		return new ResponseEntity<List<Artical>>(articalList,HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Artical> getArtical(@PathVariable Integer id) {
		return new ResponseEntity<Artical>(service.getArtical(id),HttpStatus.OK);
		
	}
	@PostMapping
	public ResponseEntity<String> createArtical(@RequestBody Artical artical) {
		service.createArtical(artical);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Artical> updateArtical(@RequestBody Artical artical) {
		service.updateArtical(artical);
		return new ResponseEntity<Artical>(HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Artical>  deleteArtical(@PathVariable Integer id ) {
		service.deleteArtical(id);
		return new ResponseEntity<Artical>(HttpStatus.OK);
	}
	
	
}
