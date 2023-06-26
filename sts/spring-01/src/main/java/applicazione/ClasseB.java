package applicazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import applicazione.servizi.DaNonCaricare;
import applicazione.servizi.Interfaccia;
import applicazione.servizi.NuovoServizio1;

public class ClasseB {
	
	private String company;
	
	@Autowired
	private NuovoServizio1 servizio;
	
	private DaNonCaricare questoNo;
	
	@Autowired
	@Qualifier("bello")
	private Interfaccia inter;
	
	public ClasseB() {
		System.out.println("costruttore di ClasseB");
	}
	
	public void metodoUtile() {
		System.out.println("compay: " + company);
		servizio.m1();
		//questoNo.m();
		inter.interMetodo("stringa");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
