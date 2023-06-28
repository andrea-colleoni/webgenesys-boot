package esercizio.servizi;

import java.util.List;

import esercizio.model.Prodotto;

public interface Catalogo {
	
	List<Prodotto> elencoProdotti();

	void nuovoProdotto(Prodotto prodotto);
}
