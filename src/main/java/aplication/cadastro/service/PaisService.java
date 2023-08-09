package aplication.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplication.cadastro.model.Pais;
import aplication.cadastro.repository.PaisRepository;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository paisRepository;
	
	public List<Pais> findAll(){
		return paisRepository.findAll();
	}

}
