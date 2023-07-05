package esercizio.controller;

import java.net.URI;
import java.net.URISyntaxException;
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

import esercizio.model.Prodotto;
import esercizio.servizi.Catalogo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/prodotti")
public class ProdottiRESTController {
	
	@Autowired
	private Catalogo catalogo;

	@GetMapping
	public List<Prodotto> list() {
		return catalogo.elencoProdotti();
	}
	
	@Operation(
			summary = "Resitutisce l'elenco dei prodotti",
			tags = { "prodotti", "get" }			
	)
	@GetMapping("/{codiceProdotto}")
	public Prodotto byCodice(@PathVariable(required = true) String codiceProdotto) {
		return catalogo.perCodice(codiceProdotto);
	}
	
	@Operation(
			summary = "Inserisce un nuovo prodotto",
			tags = { "prodotti", "post" }			
	)
	@ApiResponses({
		@ApiResponse(responseCode = "201", description = "Prodotto creato"),
		@ApiResponse(responseCode = "500", description = "Errore generico sul server")
	})
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody Prodotto prodotto) {
		catalogo.nuovoProdotto(prodotto);
		try {
			return ResponseEntity.created(new URI("/prodotti/" + prodotto.getCodiceProdotto())).build();
		} catch (URISyntaxException e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@PutMapping("/{codiceProdotto}")
	public ResponseEntity<?> update(@PathVariable(required = true) String codiceProdotto, @RequestBody Prodotto prodotto) {
		catalogo.aggiornaProdotto(prodotto);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{codiceProdotto}")
	public ResponseEntity<?> delete(@PathVariable(required = true) String codiceProdotto) {
		catalogo.elimina(codiceProdotto);
		return ResponseEntity.ok().build();
	}
}
