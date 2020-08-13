package com.crud;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository  
public interface PersonaRepositorio extends CrudRepository<Persona, Integer> {
	List<Persona>findAll();
	Persona save(Persona p);
	void delete(Persona p);
}
