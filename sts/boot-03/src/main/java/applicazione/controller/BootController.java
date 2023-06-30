package applicazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BootController {

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "nome", required = true) String nome, Model model) {
		model.addAttribute("nome", nome);
		return "hello";
	}
}
