package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;	

import com.model.BookingDAO;
import com.model.Booking;
@RestController
public class BookingController {
	@Autowired
	BookingDAO bookingDAO;
	
	@PostMapping("/addbooking")
	public String addBooking(@RequestBody Booking booking) {
		bookingDAO.save(booking);
		return "Seat Successfully Booked";
	}
	@GetMapping("/gettallbookings")
	public Iterable<Booking> getAllBooking(){
		return bookingDAO.findAll();
	}
	
	@PatchMapping("/updatebooking")
	public String updateBooking(@RequestBody Booking booking) {
		bookingDAO.save(booking);
		return "Booking Updated";
	}
	
	@DeleteMapping("/cancelbooking/{id}")
	public String deleteBooking(@PathVariable("id") int bId) {
		bookingDAO.deleteById(bId);
		return "Booking cancelled";
	}
	@DeleteMapping("deleteallbookings")
	public String deleteAllBookings() {
		bookingDAO.deleteAll();
		return "all bookings deleted";
	}
	
	@GetMapping("/findbooking/{id}")
	public Optional<Booking> findbooking(@PathVariable("id") int bId) {
		return bookingDAO.findById(bId);
	}

}