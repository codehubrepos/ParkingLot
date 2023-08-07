package com.lld.parkinglot.factory;

import com.lld.parkinglot.model.enums.ParkingFeesCalculationType;
import com.lld.parkinglot.strategy.FeesCalculationStrategy;
import com.lld.parkinglot.strategy.FixedBasedBillCalculationStrategy;
import com.lld.parkinglot.strategy.SlabBasedBillCalculationStrategy;

public class BillCalculationFactory {
	
	public static FeesCalculationStrategy getFeesCalulationStrategy(ParkingFeesCalculationType type) {
		
		switch(type) {
			case SLAB : return new SlabBasedBillCalculationStrategy();
			case FIXED : return new FixedBasedBillCalculationStrategy();
			default : return null;
		}
	}

}
