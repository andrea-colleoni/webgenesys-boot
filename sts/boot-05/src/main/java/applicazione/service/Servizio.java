package applicazione.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import applicazione.model.Libro;
import applicazione.repository.LibroRepository;
import jakarta.persistence.EntityManager;

@Service
public class Servizio {
	
	@Autowired
	private LibroRepository repository;
	
	@Autowired
	private EntityManager em;
	
	// l potrebbe avere uno stato non ancora consistente
	@Transactional
	public void metodoCheFaCose(Libro l) {
		
		// fa cose con em => modificano il DB
		
		// se OK => upd libro
		
		// se KO => exception
		
	}

}
