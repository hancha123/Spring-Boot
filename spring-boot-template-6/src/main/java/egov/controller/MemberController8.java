package egov.controller;

import egov.model.Member;
import egov.model.RedirectResponse;
import egov.service.MemberService2;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/members")	// 이렇게 하는 경우 모든 Mapping URL에 접두어로 들어 간다.
public class MemberController8 {

	@Autowired
	private MemberService2 memberService;

	@GetMapping("/members/list")
	public List<Member> getMembers() {
		return memberService.selectMemberList();
	}

	
    @PostMapping("/members/api/insert2")
    public ResponseEntity<RedirectResponse> insertMember(@RequestBody Member member) {        
    	//System.out.println(member.getName());
    	//System.out.println(member.getEmail());
    	memberService.insertMember(member);
    	
        // 리디렉션할 URL 설정
        String redirectUrl = "/members/list" ;

        // JSON 응답 반환
        return ResponseEntity.ok(new RedirectResponse(redirectUrl));
    }
}
