package egov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController9 {

	@GetMapping("/members/form2")
	public String form() {
		return "memberForm2";
	}
}