package com.scale.handler.restappi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scale.handler.entites.Artical;

@RestController
@RequestMapping("/articals")
public class ArticalController {
	
	@GetMapping
	public List<Artical> getAllArticals(){
		return null;
		
	}
	
	@GetMapping("{id}")
	public Artical getArtical() {
		return null;
		
	}
	
	
	
}
