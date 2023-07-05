package esercizio.servizi;

import java.util.List;

import esercizio.model.Prodotto;

public interface Catalogo {
	
	List<Prodotto> elencoProdotti();

	void nuovoProdotto(Prodotto prodotto);

	Prodotto perCodice(String codiceProdotto);

	void aggiornaProdotto(Prodotto prodotto);

	void elimina(String codiceProdotto);
}
