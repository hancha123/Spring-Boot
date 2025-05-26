package egov.service;

import egov.model.Member;

import java.util.List;

public interface MemberService2 {
	List<Member> selectMemberList();

	void insertMember(Member member);
}