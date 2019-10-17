package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="bfjzm0t7xwx85t9vpsya.montres")
public class MyEntity {
	@Id
	@Column(name="id_montre")
	private String id_montre;
	
	@Column(name="nom_montre")
	private String nom_montre;
	
	@Column(name="prix_montre")
	private String prix_montre;
	
	@Column(name="boitier_part")
	private String boitier_part;
	
	@Column(name="cadrant_part")
	private String cadrant_part;
	
	@Column(name="bracelet_part")
	private String bracelet_part;
	
	@Column(name="auteur_montre")
	private String auteur_montre;
	
	@Column(name="avis_montre")
	private String avis_montre;
	
	
	@Column(name="description_montre")
	private String description_montre;
	
	@Column(name="collection_montre")
	private String collection_montre;

	public String getDescription_montre() {
		return description_montre;
	}

	public void setDescription_montre(String description_montre) {
		this.description_montre = description_montre;
	}

	public String getCollection_montre() {
		return collection_montre;
	}

	public void setCollection_montre(String collection_montre) {
		this.collection_montre = collection_montre;
	}

	public String getId_montre() {
		return id_montre;
	}

	public void setId_montre(String id_montre) {
		this.id_montre = id_montre;
	}

	public String getNom_montre() {
		return nom_montre;
	}

	public void setNom_montre(String nom_montre) {
		this.nom_montre = nom_montre;
	}

	public String getPrix_montre() {
		return prix_montre;
	}

	public void setPrix_montre(String prix_montre) {
		this.prix_montre = prix_montre;
	}

	public String getBoitier_part() {
		return boitier_part;
	}

	public void setBoitier_part(String boitier_part) {
		this.boitier_part = boitier_part;
	}

	public String getCadrant_part() {
		return cadrant_part;
	}

	public void setCadrant_part(String cadrant_part) {
		this.cadrant_part = cadrant_part;
	}

	public String getBracelet_part() {
		return bracelet_part;
	}

	public void setBracelet_part(String bracelet_part) {
		this.bracelet_part = bracelet_part;
	}

	public String getAuteur_montre() {
		return auteur_montre;
	}

	public void setAuteur_montre(String auteur_montre) {
		this.auteur_montre = auteur_montre;
	}

	public String getAvis_montre() {
		return avis_montre;
	}

	public void setAvis_montre(String avis_montre) {
		this.avis_montre = avis_montre;
	}

	
	
	
	

}
