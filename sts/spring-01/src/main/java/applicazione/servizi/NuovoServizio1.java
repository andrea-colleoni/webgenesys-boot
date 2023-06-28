package applicazione.servizi;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class NuovoServizio1 {
	
	public void m1() {
		System.out.println("servizio 1");
	}
}
