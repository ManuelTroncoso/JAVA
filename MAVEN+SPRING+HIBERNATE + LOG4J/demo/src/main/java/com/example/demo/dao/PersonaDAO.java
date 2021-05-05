package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.TPersona;

public interface PersonaDAO extends JpaRepository<TPersona, Serializable>{

//	@Query(value="SELECT * FROM PERSONA", nativeQuery=true)
//	public List<TPersona> getPersona();
	
//	@Modifying
//	@Transactional
//	@Query(value="INSERT INTO PERSONA (ID, NOMBRE, APELLIDO) VALUES ( ?, ? , ? )", nativeQuery=true)
//	public void addPersona(@Param("ID") int Id, @Param("NOMBRE") String Nombre, @Param("APELLIDO") String Apellido);
	
}
