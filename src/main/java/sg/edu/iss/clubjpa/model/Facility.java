package sg.edu.iss.clubjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facility {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int facilityId;
	private String name;
	private String description;
	
	public Facility() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facility(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
