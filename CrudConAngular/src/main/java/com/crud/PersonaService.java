package com.crud;

import java.util.List;

import org.springframework.stereotype.Service;

public interface PersonaService {
	List<Persona>listar();
	Persona listarId(int id);
	Persona agregar(Persona p);
	Persona editar(Persona p);
	Persona eliminar(int id);
}
