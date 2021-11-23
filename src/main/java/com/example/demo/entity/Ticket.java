package com.example.demo.entity;


import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Ticket {
	@Id
	Integer ticket_id;
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	Integer PNR_Number;
	
	@ManyToOne
	Flight flight;
	
	@OneToMany(mappedBy="ticket")
	List<User> user;
	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	String Status;

	
	public Integer getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(Integer ticket_id) {
		this.ticket_id = ticket_id;
	}

	public Integer getPNR_Number() {
		return PNR_Number;
	}

	public void setPNR_Number(Integer pNR_Number) {
		PNR_Number = pNR_Number;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	

}
