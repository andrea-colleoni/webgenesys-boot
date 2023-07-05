package esercizio.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import esercizio.model.Prodotto;

@Repository
@Scope("singleton")
public class ProdottiRepository {

	private List<Prodotto> prodotti;
	
	private Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private NamedParameterJdbcTemplate jdbc;

	/**
	 * 
	 */
	public ProdottiRepository() {
		log.info("init repository");
	}


	@PostConstruct
	private void init() {
		prodotti = new ArrayList<>();
	}

	/**
	 * @return the prodotti
	 */
	public List<Prodotto> getProdotti() {
		var sql = "select * from Prodotto";
		var _return = new ArrayList<Prodotto>();
		jdbc.query(sql, rs -> {
			
				_return.add(new Prodotto(
						rs.getString("codiceProdotto"), 
						rs.getString("descrizione"), 
						rs.getFloat("prezzoUnitario")));
		
		});
		return _return;
	}
}
