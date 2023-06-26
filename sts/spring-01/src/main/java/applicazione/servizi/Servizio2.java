package applicazione.servizi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("bello")
public class Servizio2 implements Interfaccia {

	@Override
	public void interMetodo(String messaggio) {
		System.out.println("implementazione serv 2");

	}

}
