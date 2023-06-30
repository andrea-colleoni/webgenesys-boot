package esercizio.config;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Profile({"default", "dev"})
public class ConfigurazioneDev implements Configurazione {
	
	@Value("${applicazione.nome:Non impostato}")
	private String nomeApplicazione;
	
	@Autowired
	private Environment environment;
	
	private Log log = LogFactory.getLog(getClass());
	

	public ConfigurazioneDev() {
		log.info("init development config");
	}

	@Override
	public String getNomeApplicazione() {
		return nomeApplicazione;
	}

	@Override
	public String getAmbiente() {
		var result = "";
		for(var p : environment.getActiveProfiles()) {
			result += p + ";";
		}
		return result;
	}

}
