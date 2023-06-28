package applicazione;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

// Java Bean
public class ClasseA  {
	
	private String nome;
	
	@Autowired
	private ClasseB b;

	public ClasseA() {
		System.out.println("costruttore di ClasseA");
	}

	public void usaB() {
		//NO!! => ClasseB b = new ClasseB();
		b.setCompany("Web Genesys");
		b.metodoUtile();
	}
	
	@PostConstruct
	public void dopoLaCostruzione() {
		System.out.println("costruito classe A");
	}
	
	@PreDestroy
	public void primaDiDereferenziare() {
		System.out.println("prima di destroy");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
