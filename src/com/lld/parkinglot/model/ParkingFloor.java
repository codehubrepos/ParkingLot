package com.lld.parkinglot.model;

import java.util.List;

import com.lld.parkinglot.model.enums.Status;

public class ParkingFloor extends BaseModel {
	
	private int floorNumber;
	private String floorManager;
	private List<ParkingSpot> parkingSpots;
	
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getFloorManager() {
		return floorManager;
	}
	public void setFloorManager(String floorManager) {
		this.floorManager = floorManager;
	}
	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
}
