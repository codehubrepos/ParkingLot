package com.lld.parkinglot.model;

import com.lld.parkinglot.model.enums.GateType;

public abstract class Gate extends BaseModel {
	
	private GateType getType;
	private Operator operator;
	
	public GateType getGetType() {
		return getType;
	}
	public void setGetType(GateType getType) {
		this.getType = getType;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}

}
