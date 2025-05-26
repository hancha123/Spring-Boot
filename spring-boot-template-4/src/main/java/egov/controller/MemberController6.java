package egov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController6 {

	//@Autowired
	//private MemberService memberService;

	@GetMapping("/members/info")
	public String form() {
		return "memberInfo";
	}
}
