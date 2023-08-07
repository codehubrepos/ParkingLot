package com.lld.parkinglot.controller;

import com.lld.parkinglot.dto.BillRequestDto;
import com.lld.parkinglot.dto.GenerateBillResponseDto;
import com.lld.parkinglot.exception.ParkingException;
import com.lld.parkinglot.model.Bill;
import com.lld.parkinglot.service.BillService;

public class BillController {
	
	private BillService billService;

	public BillController(BillService billService) {
		this.billService = billService;
	}

	public GenerateBillResponseDto generateBill(
				BillRequestDto requestDto) throws ParkingException{
		
		Bill bill = billService.generateBill(requestDto);
		
		GenerateBillResponseDto responseDto = new GenerateBillResponseDto();
		responseDto.setBill(bill);
		
		return responseDto;
	}


}
