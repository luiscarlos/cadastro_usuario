package aplication.cadastro.resource;

import org.springframework.beans.factory.annotation.Autowired;

import aplication.cadastro.repository.PessoaRepository;

public class PessoaResource {
	
	@Autowired
	private PessoaRepository pessoaRepository;

}
