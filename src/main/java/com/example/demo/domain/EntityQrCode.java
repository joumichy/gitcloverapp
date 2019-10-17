package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bfjzm0t7xwx85t9vpsya.table_qr")
public class EntityQrCode {

	@Id
	@Column(name = "id_qr")
	private int id_qr;

	@Column(name = "nom_qr")
	private String nom_qr;

	@Column(name = "position")
	private String position;

	public int getId_qr() {
		return id_qr;
	}

	public void setId_qr(int id_qr) {
		this.id_qr = id_qr;
	}

	public String getNom_qr() {
		return nom_qr;
	}

	public void setNom_qr(String nom_qr) {
		this.nom_qr = nom_qr;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	
}