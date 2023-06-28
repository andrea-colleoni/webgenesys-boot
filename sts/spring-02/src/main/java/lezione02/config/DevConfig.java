package lezione02.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"sviluppo", "default"})
public class DevConfig implements AppConfig {
	
	private Log log = LogFactory.getLog(getClass());

	@Override
	public void printConfig() {
		log.debug("Sviluppo");
	}

}
