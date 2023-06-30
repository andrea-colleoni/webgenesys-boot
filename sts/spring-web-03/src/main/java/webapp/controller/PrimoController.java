package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrimoController {

	@GetMapping("/hello")
	public String hello() {
		return "index";
	}
}
