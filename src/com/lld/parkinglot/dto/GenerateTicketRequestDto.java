package com.lld.parkinglot.dto;

import com.lld.parkinglot.model.EntryGate;
import com.lld.parkinglot.model.Vehicle;

public class GenerateTicketRequestDto {

	private Vehicle vehicle;
	private EntryGate entryGate;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public EntryGate getEntryGate() {
		return entryGate;
	}
	public void setEntryGate(EntryGate entryGate) {
		this.entryGate = entryGate;
	}
}
