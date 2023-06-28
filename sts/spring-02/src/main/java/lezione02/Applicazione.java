package lezione02;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import lezione02.config.AppConfig;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class Applicazione {
	
	@Value("${applicazione.nome:Unknown}")
	private String nomeApplicazione;
	
	@Value("${applicazione.ambiente:Unknown}")
	private String ambiente;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private AppConfig config;
	
	private Log log = LogFactory.getLog(getClass());

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(Applicazione.class);
		var app = ctx.getBean(Applicazione.class);
		app.run();
	}
	
	public void run() {
		log.info("Nome applicazione: " + nomeApplicazione);
		log.info("Ambiente: " + ambiente);
		for(var s : env.getActiveProfiles()) {
			log.info("Profilo: " + s);
		}
		config.printConfig();
	}
}
