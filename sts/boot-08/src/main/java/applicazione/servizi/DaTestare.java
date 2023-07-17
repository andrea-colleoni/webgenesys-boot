package applicazione.servizi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaTestare {
	
	private Log log = LogFactory.getLog(getClass());
	
	@Autowired
	ServizioTerzo terzo;
	
	public String daTestare() {
		log.info("metodo da testare");
		var risultato = terzo.metodo();
		log.info("finito");
		return risultato;
	}

}
