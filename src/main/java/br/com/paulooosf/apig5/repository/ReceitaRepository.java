package br.com.paulooosf.apig5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.paulooosf.apig5.model.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {
	
}
