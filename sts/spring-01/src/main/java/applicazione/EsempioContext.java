package applicazione;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EsempioContext {

	public static void main(String[] args) {
		// ctrl-shit-o => fix imports
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurazione.class);
		
		// NO! => ClasseA a = new ClasseA();
		ClasseA a = context.getBean(ClasseA.class);
		a.usaB();
	}
}
