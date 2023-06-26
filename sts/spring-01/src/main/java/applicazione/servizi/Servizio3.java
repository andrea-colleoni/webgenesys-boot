package applicazione.servizi;

import org.springframework.stereotype.Component;

@Component
public class Servizio3 implements Interfaccia {

	@Override
	public void interMetodo(String messaggio) {
		System.out.println("implementazione serv 3");
	}

}
