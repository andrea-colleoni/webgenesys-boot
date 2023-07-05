package applicazione.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "autori")
public class Autore {
	
	@Id
	@Column(nullable = false, name = "codFisc")
	private String codiceFiscale;
	@Column(length = 50)
	private String nome;
	@Column(length = 50)
	private String cognome;
	
	@OneToMany(mappedBy = "autore")
	@JsonIgnore
	// @JsonIgnoreProperties
	// https://stackoverflow.com/questions/23869061/handling-jackson-parent-child-serialization
	private List<Libro> libri;
	
	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	@Override
	public String toString() {
		return "Autore [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	/**
	 * @return the libri
	 */
	public List<Libro> getLibri() {
		return libri;
	}
	/**
	 * @param libri the libri to set
	 */
	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	
	

}
