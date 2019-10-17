package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	@RequestMapping("/{id_montre}")
	public List<MyEntity >showfonctionFonction(@PathParam("id_montre") String id_montre) {
		return myrepository.showname (id_montre);
	}

}
