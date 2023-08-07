package com.lld.parkinglot.dto;

import com.lld.parkinglot.model.ExitGate;
import com.lld.parkinglot.model.Ticket;
import com.lld.parkinglot.model.enums.ParkingFeesCalculationType;

public class BillRequestDto {

	private Ticket ticket;
	private ExitGate exitGate;
	private ParkingFeesCalculationType billCalcType;
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public ExitGate getExitGate() {
		return exitGate;
	}
	public void setExitGate(ExitGate exitGate) {
		this.exitGate = exitGate;
	}
	public ParkingFeesCalculationType getBillCalcType() {
		return billCalcType;
	}
	public void setBillCalcType(ParkingFeesCalculationType billCalcType) {
		this.billCalcType = billCalcType;
	}
	

}
