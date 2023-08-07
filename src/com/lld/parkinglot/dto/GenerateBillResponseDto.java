package com.lld.parkinglot.dto;

import com.lld.parkinglot.model.Bill;

public class GenerateBillResponseDto {

	private Bill bill;
	
	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

}
