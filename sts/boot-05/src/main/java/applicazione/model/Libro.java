package applicazione.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "isbn")
public class Libro {
	
	@Id
	private String ISBN;
	private String titolo;
	private Integer numeroPagine;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	//@JsonBackReference
	private Autore autore;
	
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}
	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	/**
	 * @return the autore
	 */
	public Autore getAutore() {
		return autore;
	}
	/**
	 * @param autore the autore to set
	 */
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	/**
	 * @return the numeroPagine
	 */
	public Integer getNumeroPagine() {
		return numeroPagine;
	}
	/**
	 * @param numeroPagine the numeroPagine to set
	 */
	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titolo=" + titolo + ", autore=" + autore + ", numeroPagine=" + numeroPagine
				+ "]";
	}
	
	

}
