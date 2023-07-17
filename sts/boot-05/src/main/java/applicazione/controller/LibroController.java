package applicazione.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import applicazione.model.Libro;
import applicazione.repository.LibroRepository;

@RestController
@RequestMapping("/libri")
public class LibroController {
	
	@Autowired
	private LibroRepository repository;

	@GetMapping
	public List<Libro> list() {
		return repository.findAll();
	}

	@GetMapping("/{ISBN}")
	public Libro byCodice(@PathVariable(required = true) String ISBN) {
		return repository.findById(ISBN).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody Libro libro) {
		repository.save(libro);
		return ResponseEntity.ok(libro);
	}
	
	@PutMapping("/{ISBN}")
	public ResponseEntity<?> update(@PathVariable(required = true) String ISBN, @RequestBody Libro libro) {
		repository.save(libro);
		return ResponseEntity.ok(libro);
	}
	
	@DeleteMapping("/{ISBN}")
	public ResponseEntity<?> delete(@PathVariable(required = true) String ISBN) {
		repository.deleteById(ISBN);
		return ResponseEntity.ok().build();
	}
}
