package esercizio.servizi;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esercizio.model.Prodotto;
import esercizio.repository.ProdottiRepository;

@Service
public class CatalogoService implements Catalogo {

	@Autowired
	private ProdottiRepository repository;
	
	private Log log = LogFactory.getLog(getClass());
	
	@Override
	public List<Prodotto> elencoProdotti() {
		log.info("elenco prodotti");
		return repository.getProdotti();
	}

	@Override
	public void nuovoProdotto(Prodotto prodotto) {
		log.info("nuovo prodotto");
		repository.getProdotti().add(prodotto);
	}

	@Override
	public Prodotto perCodice(String codiceProdotto) {
		return new Prodotto("NN", "non implememtato", 0);
	}

	@Override
	public void aggiornaProdotto(Prodotto prodotto) {
		
	}

	@Override
	public void elimina(String codiceProdotto) {
		
	}

}
