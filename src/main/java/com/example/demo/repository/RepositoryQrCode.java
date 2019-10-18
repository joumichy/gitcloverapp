package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.EntityQrCode;


public interface RepositoryQrCode extends JpaRepository<EntityQrCode, String> {
	

String my_request = "SELECT * FROM bfjzm0t7xwx85t9vpsya.table_qr";
	
	//QUERY pour récupérer la table table_qr
	@Query(value = my_request+";", nativeQuery = true)
	public List<EntityQrCode> showallqrcode();
	
	//QUERY pour récupérer les informations d'un champs en fonction de la clé primaire du QR code
	@Query(value = my_request+" WHERE id_qr = :id_qr ", nativeQuery = true)
	public List<EntityQrCode> showidqr(@Param("id_qr") int id_qr);

}
