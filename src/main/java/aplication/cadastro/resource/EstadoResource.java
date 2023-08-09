package aplication.cadastro.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aplication.cadastro.model.Estado;
import aplication.cadastro.model.Pais;
import aplication.cadastro.service.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoService estadoService;
	
	
	@GetMapping
	public ResponseEntity<List<Estado>> getFindAll(){
		return ResponseEntity.ok(estadoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Estado>> getAllEstadoByPais(@PathVariable("id") Integer idPais){
		return ResponseEntity.ok().body(estadoService.findAllByPais(idPais));
	}
	

}
