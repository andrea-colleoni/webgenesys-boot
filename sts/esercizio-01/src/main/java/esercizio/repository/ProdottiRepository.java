package esercizio.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import esercizio.model.Prodotto;

@Repository
@Scope("singleton")
public class ProdottiRepository {

	private List<Prodotto> prodotti;

	/**
	 * 
	 */
	public ProdottiRepository() {
	}


	@PostConstruct
	private void init() {
		prodotti = new ArrayList<>();
	}

	/**
	 * @return the prodotti
	 */
	public List<Prodotto> getProdotti() {
		return prodotti;
	}
	
	
}
