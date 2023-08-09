package aplication.cadastro.service;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public List<Estado> findAllByPais(Integer id){
		List<Estado> estadoPesquisa = new ArrayList<Estado>();
		List<Estado> estado = estadoRepository.findAll();
		
		for (int i = 0;  i < estado.size(); i ++) {
			if(estado.get(i).getPais().getId() == id) {
				estadoPesquisa.add(estado.get(i));
			}
		}
		return estadoPesquisa;
	}



}
