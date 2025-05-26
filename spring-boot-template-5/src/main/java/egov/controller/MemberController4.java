package egov.controller;

import egov.model.Member;
import egov.service.MemberService2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController4 {

	@Autowired
	private MemberService2 memberService;

	@GetMapping("/members/form")
	public String form() {
		return "memberForm";
	}	
	
    @PostMapping("/members/api/insert")
    public String insertMember(Member member) {
        memberService.insertMember(member);
        return "redirect:/members/list"; // 또는 다른 결과 페이지로 리디렉션
    }
}