package applicazione.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${applicazione.nome}")
	private String configValue;
	
	@GetMapping("/test-config")
	public String testConfig() {
		return configValue;
	}
}
