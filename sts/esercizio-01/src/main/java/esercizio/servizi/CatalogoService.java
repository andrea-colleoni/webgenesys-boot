package esercizio.servizi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esercizio.model.Prodotto;
import esercizio.repository.ProdottiRepository;

@Service
public class CatalogoService implements Catalogo {

	@Autowired
	private ProdottiRepository repository;
	
	@Override
	public List<Prodotto> elencoProdotti() {
		return repository.getProdotti();
	}

	@Override
	public void nuovoProdotto(Prodotto prodotto) {
		repository.getProdotti().add(prodotto);
	}

}
