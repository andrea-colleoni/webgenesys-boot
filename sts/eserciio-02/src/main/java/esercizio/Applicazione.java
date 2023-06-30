package esercizio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import esercizio.config.Configurazione;
import esercizio.model.Prodotto;
import esercizio.servizi.Catalogo;

@ComponentScan
@PropertySource("classpath:application.properties")
@Configuration
public class Applicazione {
	
	@Autowired
	private Catalogo catalogo;
	
	@Autowired
	private Configurazione config;
	
	private Log log = LogFactory.getLog(getClass());

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(Applicazione.class);
		var app = ctx.getBean(Applicazione.class);
		app.run();
	}
	
	
	
	public void run() {
		log.info("Avvio applicazione");
		log.info("Nome: " + config.getNomeApplicazione() + "; Ambiente: " + config.getAmbiente());
		
		catalogo.nuovoProdotto(new Prodotto("ABC", "Mele", 1));
		catalogo.nuovoProdotto(new Prodotto("DEF", "Pere", 1.2F));
		
		for(var p : catalogo.elencoProdotti()) {
			log.info(p.toString());
		}
	}

}
