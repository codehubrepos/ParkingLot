package com.lld.parkinglot.model;

import java.util.List;
import java.util.Map;

import com.lld.parkinglot.model.enums.Status;
import com.lld.parkinglot.model.enums.SpotType;

public class ParkingLot extends BaseModel {
	
	private List<ParkingFloor> parkingFloors;
	private List<Gate> gates;
	private Status parkingLotStatus;
	private String name;
	private String address;
	private Map<SpotType, Integer> baseRateMap;
	
	public List<ParkingFloor> getParkingFloors() {
		return parkingFloors;
	}
	public void setParkingFloors(List<ParkingFloor> parkingFloors) {
		this.parkingFloors = parkingFloors;
	}
	public List<Gate> getGates() {
		return gates;
	}
	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}
	public Status getParkingLotStatus() {
		return parkingLotStatus;
	}
	public void setParkingLotStatus(Status parkingLotStatus) {
		this.parkingLotStatus = parkingLotStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<SpotType, Integer> getBaseRateMap() {
		return baseRateMap;
	}
	public void setBaseRateMap(Map<SpotType, Integer> baseRateMap) {
		this.baseRateMap = baseRateMap;
	}
}
