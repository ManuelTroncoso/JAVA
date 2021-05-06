package dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.TProfesor;

public interface ProfesorDAO extends JpaRepository<TProfesor, Serializable> {

}
