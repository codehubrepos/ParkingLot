package com.lld.parkinglot.dto;

import com.lld.parkinglot.model.Ticket;

public class GenerateTicketResponseDto {

	private Ticket ticket;

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
