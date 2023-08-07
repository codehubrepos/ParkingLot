package com.lld.parkinglot.strategy;

import com.lld.parkinglot.exception.ParkingException;
import com.lld.parkinglot.model.ParkingFloor;
import com.lld.parkinglot.model.ParkingLot;
import com.lld.parkinglot.model.ParkingSpot;
import com.lld.parkinglot.model.enums.ParkingSpotStatus;
import com.lld.parkinglot.model.enums.VehicleType;
import com.lld.parkinglot.service.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindStrategy implements ParkingSpotFindStrategy {

	private ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;
	
	public RandomParkingSpotFindStrategy(ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService) {
		this.parkingSpotVehicleTypeMatchingService = parkingSpotVehicleTypeMatchingService;
	}

	/**
	 * This method will first list out all the parking floors
	 * From the list of Parking floor it will list out all the Parking Spots 
	 * To get the available parking slot it will check the status of parking spot as AVAILABLE
	 * and match the spot type with the vehicle type through the service method matches
	 * @throws ParkingSpotNotFoundException 
	 * */
	@Override
	public ParkingSpot getParkingSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingException {
		for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
			for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
				if((parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) &&
				(parkingSpotVehicleTypeMatchingService.matches(parkingSpot.getSpotType(), vehicleType))) {
					return parkingSpot;
				}
				else {
					throw new ParkingException("No ParkingSpot Found for the Vehicle");
				}
				
			}
		}
		return null;
	}
}
