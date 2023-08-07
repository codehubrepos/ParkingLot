package com.lld.parkinglot.model;

import java.util.Date;
import java.util.List;

import com.lld.parkinglot.model.enums.TransactionStatus;

public class Bill extends BaseModel {
	
	private Ticket ticket;
	private Date exitTime;
	private int amount;
	private Operator operator;
	private Gate exitGate;
	private List<Payment> payment;
	private TransactionStatus billStatus;
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Date getExitTime() {
		return exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Gate getExitGate() {
		return exitGate;
	}
	public void setExitGate(Gate exitGate) {
		this.exitGate = exitGate;
	}
	public List<Payment> getPayment() {
		return payment;
	}
	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	public TransactionStatus getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(TransactionStatus billStatus) {
		this.billStatus = billStatus;
	}

}
