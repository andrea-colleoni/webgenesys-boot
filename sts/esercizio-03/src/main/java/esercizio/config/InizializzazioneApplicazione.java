package esercizio.config;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import esercizio.model.Prodotto;
import esercizio.servizi.Catalogo;

@Component
@PropertySource("classpath:application.properties")
public class InizializzazioneApplicazione {
	
	private Log log = LogFactory.getLog(getClass());

	@Autowired
	private Catalogo catalogo;
	
	@Autowired
	private Configurazione config;
	
	@PostConstruct
	public void init() {
		log.info("Avvio applicazione");
		log.info("Nome: " + config.getNomeApplicazione() + "; Ambiente: " + config.getAmbiente());
		
		catalogo.nuovoProdotto(new Prodotto("ABC", "Mele", 1));
		catalogo.nuovoProdotto(new Prodotto("DEF", "Pere", 1.2F));
		
		for(var p : catalogo.elencoProdotti()) {
			log.info(p.toString());
		}
	}
	
}
