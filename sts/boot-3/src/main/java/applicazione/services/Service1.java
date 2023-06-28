package applicazione.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service1 implements InitializingBean {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Value("${utente.email:defaul@mail}")
	private String email;

	/**
	 * 
	 */
	public Service1() {
		logger.info("costruzione servizio => " + email);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("email configurata => " + email);
	}
	
}
