package sg.edu.iss.clubjpa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.iss.clubjpa.model.Booking;
import sg.edu.iss.clubjpa.repo.BookingRepository;

public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository brepo;

	@Transactional
	public Booking findBookingById(Integer Id){
		return brepo.findById(Id).get(); 
	}

}
