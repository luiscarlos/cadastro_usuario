package aplication.cadastro.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aplication.cadastro.model.Pais;
import aplication.cadastro.repository.PaisRepository;

@RestController
@RequestMapping("/paises")
public class PaisResource {
	
	@Autowired
	private PaisRepository paisRepository;
	
	@GetMapping
	public ResponseEntity<List<Pais>> getFindAll(){
		return ResponseEntity.ok().body(paisRepository.findAll());
		
	}

}
