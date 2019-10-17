package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.MyEntity;
import com.example.demo.repository.MyRepository;

@RestController
public class WatchController {
	
	@Autowired
	MyRepository myrepository;
	
	@GetMapping
	@RequestMapping("/hello")
	public List<MyEntity >helloFonction() {
		return myrepository.showall();
	}
	
	@GetMapping
	@RequestMapping("/searchbynommontre/{nom_montre}")
	public List<MyEntity >showNameMontre(@PathVariable("nom_montre") String nom_montre) {
		List<MyEntity> myEntities = this.myrepository.showname(nom_montre);
		return myEntities;
	}
	
	@GetMapping
	@RequestMapping("/searchbyidmontre/{id_montre}")
	public List<MyEntity >showIdMontre(@PathVariable("id_montre") int id_montre) {

		return myrepository.showidmontre (id_montre);
	}

}
