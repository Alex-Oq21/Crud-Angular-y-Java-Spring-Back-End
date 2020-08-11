package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonaServiceImp implements PersonaService{
	@Autowired
	private PersonaRepositorio repositorio;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona agregar(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona editar(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
