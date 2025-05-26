package egov.controller;

import egov.model.Member;
import egov.service.MemberService2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
//@RequestMapping("/members")	// 이렇게 하는 경우 모든 Mapping URL에 접두어로 들어 간다.
public class MemberController3 {

	@Autowired
	private MemberService2 memberService;

	@GetMapping("/members/list")
	public List<Member> getMembers() {
		return memberService.selectMemberList();
	}
}