package com.lld.parkinglot.strategy;

import com.lld.parkinglot.model.Bill;
import com.lld.parkinglot.model.Ticket;

public interface FeesCalculationStrategy {
	
	Bill calculateCharges(Ticket ticket, Bill bill);

}
