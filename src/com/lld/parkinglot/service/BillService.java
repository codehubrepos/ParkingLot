package com.lld.parkinglot.service;

import java.util.Date;
import java.util.List;

import com.lld.parkinglot.dto.BillRequestDto;
import com.lld.parkinglot.exception.ParkingException;
import com.lld.parkinglot.factory.BillCalculationFactory;
import com.lld.parkinglot.model.Bill;
import com.lld.parkinglot.model.Payment;
import com.lld.parkinglot.model.enums.ParkingFeesCalculationType;
import com.lld.parkinglot.model.enums.TransactionStatus;
import com.lld.parkinglot.strategy.FeesCalculationStrategy;

public class BillService {
	
	
	public Bill generateBill(BillRequestDto requestDto) throws ParkingException{
		
		Bill bill = new Bill();
		bill.setExitTime(new Date());
		bill.setTicket(requestDto.getTicket()); 
		bill.setExitGate(requestDto.getExitGate());
		bill.setOperator(requestDto.getExitGate().getOperator());
		
		//requestDto.setBillCalcType(ParkingFeesCalculationType.FIXED);
		
		FeesCalculationStrategy billCalculationStrategy = 
					BillCalculationFactory.getFeesCalulationStrategy(requestDto.getBillCalcType());
		
		Bill generatedBill = billCalculationStrategy.calculateCharges(requestDto.getTicket(),bill);
		
		/*
		 * Bill bill = new Bill(); 
		 * 
		 */
		return null;
	}
	
	private int amount;
	private List<Payment> payment;
	private TransactionStatus billStatus;
	
}
