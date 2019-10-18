package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.EntityQrCode;
import com.example.demo.domain.MyEntity;
import com.example.demo.repository.MyRepository;
import com.example.demo.repository.RepositoryQrCode;

//RestController Class
@RestController
public class WatchController {
	
	//Init
	@Autowired
	MyRepository myrepository;
	
	@Autowired
	RepositoryQrCode repositoryQrCode;
	
	//Request On PATH : http://localhost:8080 
	@GetMapping
	@RequestMapping("/hello") //PATH + RequestMapping
	public List<MyEntity >helloFonction() {
		/**
		 * helloFonction() renvoie toute la base de donnnée des montres
		 * sous un format Json
		 */
		return myrepository.showall();
	}
	/**
	 * showNameMontre, renvoie en format json, les informations relatives
	 * d'une table possedant le parametre inséré par l'utilisateur
	 * 
	 * @param nom_montre correspont à l'information dans la colonne nom_montre de la table montres
	 * @return une liste en format json.
	 */
	@GetMapping
	@RequestMapping("/searchbynommontre/{nom_montre}") //PATH + RequestMapping
	public List<MyEntity >showNameMontre(@PathVariable("nom_montre") String nom_montre) {
		List<MyEntity> myEntities = this.myrepository.showname(nom_montre);
		return myEntities;
	}
	/**
	 *
	 * showIdMontre, renvoie en format json, les informations relatives
	 * d'une table possedant le parametre inséré par l'utilisateur pour une montre
	 * 
	 * @param id_montre : correspont à la clé primaire dans la colonne id_montre de la table montres
	 * @return une liste en format json.
	 */
	@GetMapping
	@RequestMapping("/searchbyidmontre/{id_montre}")//PATH + RequestMapping
	public List<MyEntity >showIdMontre(@PathVariable("id_montre") int id_montre) {

		return myrepository.showidmontre (id_montre);
	}
	
	/**
	 * showIdQr, renvoie en format json, les informations relatives
	 * d'une table possedant le parametre inséré par l'utilisateur
	 * pour un QR CODE
	 * 
	 * @param id_qr : correspont à la clé primaire dans la colonne id_qr de la table montres
	 * @return une liste en format json.
	 */
	@GetMapping
	@RequestMapping("/searchbyqrcode/{id_qr}")//PATH + RequestMapping
	public List<EntityQrCode> showIdQr(@PathVariable("id_qr") int id_qr) {

		List<EntityQrCode> myEntities = this.repositoryQrCode.showidqr(id_qr);
		return myEntities;
	}
	
	/**
	 * showIdQr, renvoie en format json, les informations relatives
	 * de la table table_qr
	 * 
	 * @return une liste en format json.
	 *
	 */
	@GetMapping
	@RequestMapping("/searchbyqrcode/all")//PATH + RequestMapping
	public List<EntityQrCode> showAllQrCode() {

		List<EntityQrCode> myEntities = this.repositoryQrCode.showallqrcode();
		return myEntities;
	}

}
