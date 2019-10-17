package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "bfjzm0t7xwx85t9vpsya.table_boitier")
public class EntityBoitier {

	@Id
	@Column(name = "id_table_boitier")
	private int id_table_boitier;

	@Column(name = "nom_boitier")
	private String nom_boitier;

	@Column(name = "prix_boitier")
	private String prix_boitier;

	@Column(name = "path_boitier")
	private String path_boitier;

	
	public int getIdBoitier() {
		return id_table_boitier;
	}

	public void setIdBoitier(int id_table_boitier) {
		this.id_table_boitier = id_table_boitier;
	}

	public String getNomBoitier() {
		return nom_boitier;
	}

	public void setNomBoitier(String nom_boitier) {
		this.nom_boitier = nom_boitier;
	}

	public String getPrix_boitier() {
		return prix_boitier;
	}

	public void setPrix_boitier(String prix_boitier) {
		this.prix_boitier = prix_boitier;
	}

	public String getPath_boitier() {
		return path_boitier;
	}

	public void setPath_boitier(String path_boitier) {
		this.path_boitier = path_boitier;
	}
	
}