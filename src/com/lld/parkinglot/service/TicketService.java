package com.lld.parkinglot.service;

import com.lld.parkinglot.exception.ParkingException;
import com.lld.parkinglot.factory.ParkingSpotFindFactory;
import com.lld.parkinglot.model.EntryGate;
import com.lld.parkinglot.model.ParkingSpot;
import com.lld.parkinglot.model.Ticket;
import com.lld.parkinglot.model.Vehicle;
import com.lld.parkinglot.repository.ParkingLotRepository;
import com.lld.parkinglot.strategy.ParkingSpotFindStrategy;

public class TicketService {
	
	private ParkingSpotFindStrategy parkingSpotFindStrategy;
	private ParkingLotRepository parkingLotRepository;
	
	public TicketService(ParkingSpotFindStrategy parkingSpotFindStrategy, ParkingLotRepository parkingLotRepository) {
		super();
		this.parkingSpotFindStrategy = parkingSpotFindStrategy;
		this.parkingLotRepository = parkingLotRepository;
	}

	public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate) throws ParkingException{
		
		parkingSpotFindStrategy = ParkingSpotFindFactory.parkingSpotFindStrategy("Random");
		
		ParkingSpot availableSpot = 
				parkingSpotFindStrategy.getParkingSpot(vehicle.getVehicleType(),
						parkingLotRepository.getParkingLotWhereEntryGate(entryGate));
		Ticket ticket = new Ticket();
		ticket.setOperator(entryGate.getOperator());
		ticket.setVehicle(vehicle);
		//ticket.setEntryTime(new LocalDate());
		ticket.setGate(entryGate);
		ticket.setParkingSpot(availableSpot);
		
		return ticket;
	}
	
}
