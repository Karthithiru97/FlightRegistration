package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ticket;
import com.example.demo.repo.TicketRepository;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketrepo;
	
	public Integer bookticket(Ticket ticket) {
		// TODO Auto-generated method stub
		Integer pnrNum=ticketrepo.save(ticket).getPNR_Number();
		return pnrNum;
	}

}
