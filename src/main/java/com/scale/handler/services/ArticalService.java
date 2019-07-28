package com.scale.handler.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scale.handler.entites.Artical;
import com.scale.handler.repo.ArticalRepositories;

@Service
public class ArticalService {
	
	@Autowired
	private ArticalRepositories articalRepo;
	
	public List<Artical> getAllArtical(){
		List<Artical> articalList = new ArrayList<Artical>();
		articalRepo.findAll().forEach(e -> articalList.add(e));
		return articalList;
	}
	
	public Artical getArtical(int id) {
		return articalRepo.findById(id).get();
	}
	
	public void createArtical(Artical artical) {
		articalRepo.save(artical);
	}
	
	public void updateArtical(Artical artical) {
		articalRepo.save(artical);
	}
	
	public void deleteArtical(int id) {
		articalRepo.deleteById(id);
	}
	
	
}
