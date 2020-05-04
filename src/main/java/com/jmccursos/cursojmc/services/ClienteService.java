package com.jmccursos.cursojmc.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmccursos.cursojmc.domain.Cliente;
import com.jmccursos.cursojmc.repositories.ClienteRepository;
import com.jmccursos.cursojmc.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired
	public ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
		 
	}
		
	
}
