package sg.edu.iss.clubjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.clubjpa.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
