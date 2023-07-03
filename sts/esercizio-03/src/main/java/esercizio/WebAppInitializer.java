package esercizio;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import esercizio.config.Configurazione;
import esercizio.model.Prodotto;
import esercizio.servizi.Catalogo;

public class WebAppInitializer implements WebApplicationInitializer{

	private Log log = LogFactory.getLog(getClass());
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		
		ctx.scan("esercizio"); // equiv a @ComponentScan
		servletContext.addListener(new ContextLoaderListener(ctx));
		
		ServletRegistration.Dynamic appServlet = 
				servletContext.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");	
	}

}
