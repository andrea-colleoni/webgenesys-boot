package applicazione.servizi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class ServizioTerzo {
	
	private Log log = LogFactory.getLog(getClass());
	
	public String metodo() {
		log.info("metodo nel servizio terzo");
		return "ok";
	}

}
