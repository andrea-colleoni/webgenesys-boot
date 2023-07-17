package applicazione.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import applicazione.model.Autore;
import applicazione.repository.AutoreRepository;

@RestController
@RequestMapping("/autori")
public class AutoreController {
	
	@Autowired
	private AutoreRepository repo;
	
	@GetMapping
	public List<Autore> all() {
		var autori = repo.findAll();
		return autori;
	}
	
	@GetMapping("/{codiceFiscale}")
	public Autore byCodice(@PathVariable(required = true) String codiceFiscale) {
		var autore = repo.findById(codiceFiscale).orElse(null);
		return autore;
	}

}
