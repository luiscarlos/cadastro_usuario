package aplication.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplication.cadastro.model.Estado;
import aplication.cadastro.repository.EstadoRepository;

@Service
public class EstadoService{
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	
	public List<Estado> findAll(){
		return estadoRepository.findAll();
	}



}
