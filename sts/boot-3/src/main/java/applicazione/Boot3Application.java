package applicazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import applicazione.services.Service1;

@SpringBootApplication
public class Boot3Application {
	
	@Autowired
	private Service1 servizio;

	public static void main(String[] args) {
		SpringApplication.run(Boot3Application.class, args);
	}

}
