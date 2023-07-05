package esercizio.config;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import esercizio.model.Prodotto;
import esercizio.servizi.Catalogo;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Component
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
	
	@Bean
	public OpenAPI openAPI() {
		
		Info info = new Info()
			.title("Catalogo prodotti")
			.version("1.0");
		
		return new OpenAPI().info(info);
	}
}
