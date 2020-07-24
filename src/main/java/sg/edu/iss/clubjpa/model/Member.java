package sg.edu.iss.clubjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memberId;
	private String firstName;
	private String surName;
	private String lastName;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String firstName, String surName, String lastName) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.lastName = lastName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
