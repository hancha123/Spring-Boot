package egov.service.impl;

import egov.mapper.MemberMapper;
import egov.model.Member;
import egov.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	@Override
	public List<Member> selectMember() {
		return memberMapper.selectMember();
	}
}