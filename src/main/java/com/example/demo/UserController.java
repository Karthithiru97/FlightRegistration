package com.example.demo;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Ticket;
import com.example.demo.entity.User;
import com.example.demo.repo.TicketRepository;
import com.example.demo.service.FlightService;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;
	@Autowired
	FlightService flightservice;
	@Autowired
	TicketRepository ticketrepo;
	
	@PostMapping("/user")
	@ResponseStatus(code=HttpStatus.CREATED)
	Integer saveUser(@Valid @RequestBody User user) {
		return userservice.save(user);
	}
	
	@PostMapping("/airlines")
	Integer createAirlines(@RequestBody Flight flight) {
		
		return flightservice.save(flight);
	}
	
	@PostMapping("/search")
  List<Flight> search()
  {
	  return flightservice.findAll();
  }
	@PostMapping("/bookticket/")
	Integer bookTicket(@RequestBody Ticket ticket)
	{
		Integer pnr=ticketrepo.save(ticket).getPNR_Number();
	return pnr;
	}
	
	
	
	}


