package egov.mapper;

import java.util.List;
import egov.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper2 {
	List<Member> selectMemberList();
	void insertMember(Member member);
}