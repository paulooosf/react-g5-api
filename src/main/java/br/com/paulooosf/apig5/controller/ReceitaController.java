package br.com.paulooosf.apig5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulooosf.apig5.model.Receita;
import br.com.paulooosf.apig5.repository.ReceitaRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {
	
	@Autowired
	private ReceitaRepository receitaRepository;
	
	@GetMapping
	public ResponseEntity<List<Receita>> listar() {
		return ResponseEntity.ok(receitaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Receita> buscar(@PathVariable Long id) {
		Optional<Receita> receitaOpt = receitaRepository.findById(id);
		if (receitaOpt.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(receitaOpt.get());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Receita inserir(@Valid @RequestBody Receita receita) {
		return receitaRepository.save(receita);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Receita> alterar(@PathVariable Long id, @Valid @RequestBody Receita receita) {
		if (!receitaRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		receita.setId(id);
		receita = receitaRepository.save(receita);
		return ResponseEntity.ok(receita);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		if (!receitaRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		receitaRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
