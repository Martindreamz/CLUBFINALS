package sg.edu.iss.clubjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.clubjpa.model.Member;
import sg.edu.iss.clubjpa.repo.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository mrepo;
	
	@Transactional
	public void saveMember(Member m) {
		mrepo.save(m);
	}
	
	@Transactional
	public List<Member> findAll(){
		return mrepo.findAll();
	}
}
