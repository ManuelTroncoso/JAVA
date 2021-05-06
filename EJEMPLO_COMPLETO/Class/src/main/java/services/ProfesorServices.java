package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProfesorDAO;
import entity.TProfesor;

@Service
public class ProfesorServices {
	
	@Autowired
	private ProfesorDAO pdao;
	
	public List<TProfesor> FindAll()
	{
		return this.pdao.findAll();
	}
	
	public List<TProfesor> Save()
	{
		return this.pdao.save();
	}	

}
