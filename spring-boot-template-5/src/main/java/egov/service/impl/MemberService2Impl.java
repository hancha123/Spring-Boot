package egov.service.impl;

import egov.mapper.MemberMapper2;
import egov.model.Member;
import egov.service.MemberService2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService2Impl implements MemberService2 {

	@Autowired
	private MemberMapper2 memberMapper;
	@Override
	public List<Member> selectMemberList() {
		return memberMapper.selectMemberList();
	}
	
	@Override
	public void insertMember(Member member) {
	    memberMapper.insertMember(member);
	}
}
