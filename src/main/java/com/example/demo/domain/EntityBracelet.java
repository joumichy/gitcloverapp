package com.example.demo.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bfjzm0t7xwx85t9vpsya.bracelet_table")
public class EntityBracelet {
	
	@Id
	@Column(name = "id_bracelet")
	private int id_bracelet;
	
	@Column(name = "nom_bracelet")
	private String nom_bracelet;
	
	@Column(name = "prix_bracelet")
	private int prix_bracelet;
	
	@Column(name = "path_bracelet")
	private int path_bracelet;
	
	public int getIdBracelet() {
		return id_bracelet;
	}
	public void setIdBracelet(int idBracelet) {
		this.id_bracelet = idBracelet;
	}
	public String getNomBracelet() {
		return nom_bracelet;
	}
	public void setNomBracelet(String nom_bracelet) {
		this.nom_bracelet = nom_bracelet;
	}
	public int getPrix_bracelet() {
		return prix_bracelet;
	}
	public void setPrix_bracelet(int prix_bracelet) {
		this.prix_bracelet = prix_bracelet;
	}
	public int getPath_bracelet() {
		return path_bracelet;
	}
	public void setPath_bracelet(int path_bracelet) {
		this.path_bracelet = path_bracelet;
	}
	
	
	
}