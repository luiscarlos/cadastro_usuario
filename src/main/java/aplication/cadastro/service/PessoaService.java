package aplication.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplication.cadastro.model.Pessoa;
import aplication.cadastro.repository.PessoaRepository;

@Service
public class PessoaService {
	
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> findAll(){
		return pessoaRepository.findAll();
	}
	
	
	private void deletar(Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}
	
	

}
