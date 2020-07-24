package sg.edu.iss.clubjpa.service;

import java.util.List;

import sg.edu.iss.clubjpa.model.Member;

public interface MemberService {
	public void saveMember(Member m); 
	public List<Member> findAll();
}
