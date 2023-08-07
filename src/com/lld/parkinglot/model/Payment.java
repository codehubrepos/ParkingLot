package com.lld.parkinglot.model;

import com.lld.parkinglot.model.enums.PaymentMode;
import com.lld.parkinglot.model.enums.TransactionStatus;

public class Payment extends BaseModel {
	
	private PaymentMode mode;
	private int amount;
	private TransactionStatus transactionStatus;
	private String paymentTrnRef;
	
	public PaymentMode getMode() {
		return mode;
	}
	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getPaymentTrnRef() {
		return paymentTrnRef;
	}
	public void setPaymentTrnRef(String paymentTrnRef) {
		this.paymentTrnRef = paymentTrnRef;
	}

}
