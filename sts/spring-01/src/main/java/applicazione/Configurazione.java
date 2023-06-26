package applicazione;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import applicazione.servizi.NuovoServizio1;

@Configuration
@ComponentScan(basePackageClasses = { NuovoServizio1.class })
public class Configurazione {
	
	@Bean
	public ClasseA a() {
		System.out.println("config di a");
		return new ClasseA();
	}
	
	@Bean
	public ClasseB b() {
		System.out.println("config di b");
		return new ClasseB();
	}

}
