package esercizio.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import esercizio.model.Prodotto;

@Repository
@Scope("singleton")
public class ProdottiRepository {

	private List<Prodotto> prodotti;
	
	private Log log = LogFactory.getLog(getClass());

	/**
	 * 
	 */
	public ProdottiRepository() {
		log.info("init repository");
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
