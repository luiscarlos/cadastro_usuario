package aplication.cadastro.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aplication.cadastro.model.Pessoa;
import aplication.cadastro.service.PessoaService;


@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> getFindAll(){
		return ResponseEntity.ok().body(pessoaService.findAll());
	}

}
