package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MyEntity;

@Repository
public interface MyRepository extends JpaRepository<MyEntity, String>{
	
	String my_request = "SELECT * FROM bfjzm0t7xwx85t9vpsya.montres";
	
	@Query(value = my_request+";", nativeQuery = true)
	public List<MyEntity> showall();
	
	@Query(value = my_request+ " WHERE nom_montre = :nom_montre ;", nativeQuery = true)
	public List<MyEntity> showname(@Param("nom_montre") String nom_montre);

	@Query(value = my_request+ " WHERE id_montre = :id_montre ;", nativeQuery = true)
	public List<MyEntity> showidmontre(@Param("id_montre") int id_montre);
}
