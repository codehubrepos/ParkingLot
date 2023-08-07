package com.lld.parkinglot.factory;

import com.lld.parkinglot.strategy.ParkingSpotFindStrategy;
import com.lld.parkinglot.strategy.RandomParkingSpotFindStrategy;

public class ParkingSpotFindFactory {
	
	public static ParkingSpotFindStrategy parkingSpotFindStrategy(String type) {
		
		switch(type) {
			case "Random" : return new RandomParkingSpotFindStrategy(null);
			
			default : return null;
		}
	}

}
