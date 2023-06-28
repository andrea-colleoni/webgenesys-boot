package esercizio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import esercizio.model.Prodotto;
import esercizio.servizi.Catalogo;

@ComponentScan
@Configuration
public class Applicazione {
	
	@Autowired
	private Catalogo catalogo;

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(Applicazione.class);
		var app = ctx.getBean(Applicazione.class);
		app.run();
	}
	
	public void run() {
		catalogo.nuovoProdotto(new Prodotto("ABC", "Mele", 1));
		catalogo.nuovoProdotto(new Prodotto("DEF", "Pere", 1.2F));
		
		for(var p : catalogo.elencoProdotti()) {
			System.out.println(p.toString());
		}
	}

}
