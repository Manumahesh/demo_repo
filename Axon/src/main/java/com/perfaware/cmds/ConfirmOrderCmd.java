package com.perfaware.cmds;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class ConfirmOrderCmd {
	
	@TargetAggregateIdentifier
	private String orderId;
	
	public ConfirmOrderCmd() {}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "ConfirmOrderCmd [orderId=" + orderId + "]";
	}

}
