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
	
	@Query(value = my_request+ " WHERE idMontre = :id_montre;", nativeQuery = true)
	public List<MyEntity> showname(@Param("id_montre") String id_montre);

}
