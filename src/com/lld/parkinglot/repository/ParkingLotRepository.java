package com.lld.parkinglot.repository;

import java.util.HashMap;
import java.util.Map;

import com.lld.parkinglot.exception.ParkingException;
import com.lld.parkinglot.model.EntryGate;
import com.lld.parkinglot.model.Gate;
import com.lld.parkinglot.model.ParkingLot;

public class ParkingLotRepository {

	private Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
	private Map<Gate, ParkingLot> gateparkingLotMap = new HashMap<>();
	
	public ParkingLot save(ParkingLot parkingLot) {
		parkingLotMap.put(parkingLot.getId(), parkingLot);
		for(Gate gate : parkingLot.getGates()) {
			gateparkingLotMap.put(gate, parkingLot);
		}
			
		return parkingLot;
	}
	
	public ParkingLot getParkingLotWhereEntryGate(Gate gate) throws ParkingException {
		
		if(gateparkingLotMap.containsKey(gate)) {
			return gateparkingLotMap.get(gate);
		}
		else 
			throw new ParkingException("ParkingLot Not Found");
		
	}
	
}
