package applicazione;

import static applicazione.model.Role.ADMIN;
import static applicazione.model.Role.MANAGER;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import applicazione.model.RegisterRequest;
import applicazione.service.AuthenticationService;

@SpringBootApplication
public class Jwt10Application {

	public static void main(String[] args) {
		SpringApplication.run(Jwt10Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthenticationService service) {
		return args -> {
			var admin = new RegisterRequest("Admin", "Admin", "admin@mail.com", "password", ADMIN);
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = new RegisterRequest("Admin", "Admin", "manager@mail.com", "password", MANAGER);
			System.out.println("Manager token: " + service.register(manager).getAccessToken());

		};
	}

}
