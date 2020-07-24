package sg.edu.iss.clubjpa.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.clubjpa.model.Member;
import sg.edu.iss.clubjpa.service.MemberService;
import sg.edu.iss.clubjpa.service.MemberServiceImpl;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService mService;
	
	@Autowired
	public void setMemberService(MemberServiceImpl mServiceImpl) {
		this.mService = mServiceImpl;
	}
	
	@RequestMapping("/create")
	public String createMember(Model model) {
		Member m = new Member();
		model.addAttribute("member", m);
		
		return "member-create";
	}
	
	@RequestMapping("/save")
	public String saveMember(@ModelAttribute("member") Member m) {
		System.out.println(m.getFirstName());
		System.out.println(m.getSurName());
		System.out.println(m.getLastName());
		mService.saveMember(m);
		return "forward:/member/list";				
	}
	
	@RequestMapping("list")
	public String allMember(Model model) {
		List<Member> members = mService.findAll();
		model.addAttribute("members", members);
		return "member-list";
	}
}
