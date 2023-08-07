package com.lld.parkinglot.strategy;

import com.lld.parkinglot.exception.ParkingException;
import com.lld.parkinglot.model.ParkingLot;
import com.lld.parkinglot.model.ParkingSpot;
import com.lld.parkinglot.model.enums.VehicleType;

public interface ParkingSpotFindStrategy {
	
	/**
	 * This method will take the Vehicle Type and the entire ParkingLot space
	 * to scan through and find the spot/slot for teh new vehicle which has arrived.
	 * @throws ParkingSpotNotFoundException 
	 * */
	ParkingSpot getParkingSpot(VehicleType vehicleType, 
				ParkingLot parkingLot) throws ParkingException;

}

