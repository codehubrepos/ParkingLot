package com.lld.parkinglot.service;

import com.lld.parkinglot.model.enums.SpotType;
import com.lld.parkinglot.model.enums.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {
	
	public boolean matches(SpotType spotType, VehicleType vehicleType) {
		return switch(spotType) {
			case LARGE -> vehicleType.equals(VehicleType.LARGE);
			case SMALL -> vehicleType.equals(VehicleType.SMALL);
			case MEDIUM -> vehicleType.equals(VehicleType.MEDIUM);
			case ELECTRIC -> vehicleType.equals(VehicleType.ELECTRIC);
		};
	}
}
