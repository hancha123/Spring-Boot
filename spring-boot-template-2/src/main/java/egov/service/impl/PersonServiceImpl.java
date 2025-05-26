package egov.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import egov.mapper.MemberMapper;
import egov.model.Person;
import egov.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	// @Autowired
	// private MemberMapper memberMapper;	// DB 연동 시 Mapper 사용	

	@Override
	public List<Person> selectPerson() {
		
		List<Person> list = new ArrayList<Person>();
				
		Person member1 = new Person();
		member1.setId("1");
		member1.setName("홍길동");
		member1.setEmail("hong@naver.com");
		list.add(member1);
		
		Person member2 = new Person();
		member2.setId("2");
		member2.setName("김길동");
		member2.setEmail("kim@naver.com");
		list.add(member2);
		
		Person member3 = new Person();
		member3.setId("3");
		member3.setName("박길동");
		member3.setEmail("park@naver.com");
		list.add(member3);
		
		return list;
	}
}