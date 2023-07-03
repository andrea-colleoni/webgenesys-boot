package applicazione.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import applicazione.model.Persona;

@RestController
@RequestMapping("/persone")
public class PersoneController {
	
	private Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private NamedParameterJdbcTemplate jdbc;

	@GetMapping
	public List<Persona> all(@RequestParam(required = false) String term) {
		log.info("elenco delle persone");
		var elenco = new ArrayList<Persona>();
		var sql = "select * from persona";
		var params = new HashMap<String, Object>();
		if(term != null) {
			params.put("term", term + "%");
			sql += " where cognome like :term";
		}
		jdbc.query(sql, params, rs -> {
			elenco.add(new Persona(
					rs.getString("nome"),
					rs.getString("cognome"), 
					rs.getDate("dataNascita"), 
					rs.getString("email")));
		});
		
		return elenco;
	}
	
	@GetMapping("/{email}")
	public Persona perChiave(@PathVariable(required = true) String email) {
		log.info("persona per chiave => " + email);
		return new Persona("Andrea", "Colleoni", new Date(), email);
	}
	
	@PostMapping
	public ResponseEntity<?> crea(@RequestBody Persona persona) {
		log.info("creazione persona => " + persona.toString());
		try {
			return ResponseEntity.created(new URI("/persone/" + persona.getEmail())).build();
		} catch (URISyntaxException e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	// @CookiValue, @SessionAttribute, @RequestAttribute
	@PutMapping("/{email}")
	public void modifica(
			@PathVariable(required = true) String email, 
			@RequestParam Boolean notifica,
			@RequestBody Persona persona,
			@RequestHeader(required = true) String mittente
			) {
		log.info("modifica persona => " + persona.toString());
		log.info("mittente => " + mittente);
	}
	
	@DeleteMapping("/{email}")
	public void modifica(
			@PathVariable(required = true) String email
			) {
		log.info("elimina persona => " + email);
	}	
}
