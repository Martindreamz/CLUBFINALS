package sg.edu.iss.clubjpa.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.FutureOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	@OneToOne
	private Facility facility;
	
	@OneToOne
	private Member member;
	
	@FutureOrPresent
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private LocalDate fromDate;
	
	@FutureOrPresent
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private LocalDate toDate;
	private String description;


	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public Facility getFacility() {
		return facility;
	}


	public void setFacility(Facility facility) {
		this.facility = facility;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	

	public LocalDate getFromDate() {
		return fromDate;
	}


	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}


	public LocalDate getToDate() {
		return toDate;
	}


	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



}
