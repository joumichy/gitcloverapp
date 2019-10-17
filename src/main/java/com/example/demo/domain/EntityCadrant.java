package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class EntityCadrant {

	@Id
	@Column(name = "id_table_cadrant")
	private int id_table_cadrant;
	
	@Column(name = "nom_cadrant")
	private String nom_cadrant;
	
	@Column(name = "prix_cadrant")
	private int prix_cadrant;
	
	@Column(name = "path_cadrant")
	private String path_cadrant;
	
	public int getIdCadran() {
		return id_table_cadrant;
	}

	public void setIdCadran(int id_table_cadrant) {
		this.id_table_cadrant = id_table_cadrant;
	}

	public String getNomCadran() {
		return nom_cadrant;
	}

	public void setNomCadran(String nom_cadrant) {
		this.nom_cadrant = nom_cadrant;
	}

	public int getPrix_cadrant() {
		return prix_cadrant;
	}

	public void setPrix_cadrant(int prix_cadrant) {
		this.prix_cadrant = prix_cadrant;
	}

	public String getPath_cadrant() {
		return path_cadrant;
	}

	public void setPath_cadrant(String path_cadrant) {
		this.path_cadrant = path_cadrant;
	}


}