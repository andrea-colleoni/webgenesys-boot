package esercizio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import esercizio.servizi.Catalogo;

@Controller
public class ProdottiController {

	@Autowired
	private Catalogo catalogo;
		
	@GetMapping("/elenco-prodotti")
	public ModelAndView elencoProdotti(ModelAndView modelAndView) {
		modelAndView.getModelMap().addAttribute("elencoProdotti", catalogo.elencoProdotti());
		modelAndView.setViewName("elenco-prodotti");
		return modelAndView;
	}
	
}
