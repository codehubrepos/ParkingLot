package com.lld.parkinglot.model;

public class ElectricParkingSpot extends ParkingSpot {
	
	private ElectricCharger electricCharger;
	private double unitsConsumed;
	
	public ElectricCharger getElectricCharger() {
		return electricCharger;
	}
	public void setElectricCharger(ElectricCharger electricCharger) {
		this.electricCharger = electricCharger;
	}
	public double getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

}
