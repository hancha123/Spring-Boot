package egov.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import egov.model.Member;
import egov.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/api/json/display")
	public List<Member> selectMember() {			
		return memberService.selectMember();
	}
}
