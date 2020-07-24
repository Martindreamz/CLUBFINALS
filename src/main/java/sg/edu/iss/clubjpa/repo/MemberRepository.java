package sg.edu.iss.clubjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.clubjpa.model.Member;


public interface MemberRepository extends JpaRepository<Member, Integer> {

}
