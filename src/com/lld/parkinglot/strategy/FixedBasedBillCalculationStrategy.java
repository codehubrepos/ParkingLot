package com.lld.parkinglot.strategy;

import com.lld.parkinglot.model.Bill;
import com.lld.parkinglot.model.Ticket;

public class FixedBasedBillCalculationStrategy implements FeesCalculationStrategy {

	@Override
	public Bill calculateCharges(Ticket ticket, Bill bill) {
		
		long exitTime = bill.getExitTime().getTime();
		long entryTime = ticket.getEntryTime().getTime();
		
		int hrs = (int) ((exitTime-entryTime)/(1000*60*60));
		int amount = hrs*2;
		bill.setAmount(amount);
		return bill;
	}

}
