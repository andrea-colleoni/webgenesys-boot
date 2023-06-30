package esercizio.model;

public class Prodotto {
	
	private String codiceProdotto;
	private String descrizione;
	private float prezzoUnitario;
	
	/**
	 * @param codiceProdotto
	 * @param descrizione
	 * @param prezzoUnitario
	 */
	public Prodotto(String codiceProdotto, String descrizione, float prezzoUnitario) {
		super();
		this.codiceProdotto = codiceProdotto;
		this.descrizione = descrizione;
		this.prezzoUnitario = prezzoUnitario;
	}
	
	/**
	 * @return the codiceProdotto
	 */
	public String getCodiceProdotto() {
		return codiceProdotto;
	}
	/**
	 * @param codiceProdotto the codiceProdotto to set
	 */
	public void setCodiceProdotto(String codiceProdotto) {
		this.codiceProdotto = codiceProdotto;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the prezzoUnitario
	 */
	public float getPrezzoUnitario() {
		return prezzoUnitario;
	}
	/**
	 * @param prezzoUnitario the prezzoUnitario to set
	 */
	public void setPrezzoUnitario(float prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}

	@Override
	public String toString() {
		return "Prodotto [codiceProdotto=" + codiceProdotto + ", descrizione=" + descrizione + ", prezzoUnitario="
				+ prezzoUnitario + "]";
	}

}
