package egov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "<!DOCTYPE html>"
		+ "<html>"
		+ "<head>"
		+ "<meta charset=\'UTF-8\'>"
		+ "<title>Welcome</title>"
		+ "</head>"
		+ "<body>"
		+ "<p align=\'center\' style=\'font-size:30px; color:blue;\'>"
		+ "Welcome from Spring Boot!"
		+ "</p>"
		+ "</body>"
		+ "</html>";
	}
}