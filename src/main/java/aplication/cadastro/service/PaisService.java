package aplication.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplication.cadastro.repository.PaisRepository;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository paisRepository;

}
