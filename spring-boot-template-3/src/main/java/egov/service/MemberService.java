package egov.service;

import egov.model.Member;
import java.util.List;

public interface MemberService {
	List<Member> selectMember();
}