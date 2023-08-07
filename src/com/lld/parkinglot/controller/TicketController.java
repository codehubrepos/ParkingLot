package com.lld.parkinglot.controller;

import com.lld.parkinglot.dto.GenerateTicketRequestDto;
import com.lld.parkinglot.dto.GenerateTicketResponseDto;
import com.lld.parkinglot.exception.ParkingException;
import com.lld.parkinglot.model.Ticket;
import com.lld.parkinglot.service.TicketService;

public class TicketController {
	
	private TicketService ticketService;
	
	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	public GenerateTicketResponseDto generateTicket(
				GenerateTicketRequestDto requestDto) throws ParkingException {
		
		Ticket ticket = ticketService.generateTicket(requestDto.getVehicle(), requestDto.getEntryGate());
		
		GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
		responseDto.setTicket(ticket);
		
		return responseDto;
	}

}
