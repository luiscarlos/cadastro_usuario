package aplication.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aplication.cadastro.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
