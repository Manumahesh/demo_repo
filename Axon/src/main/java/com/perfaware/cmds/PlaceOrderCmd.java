package com.perfaware.cmds;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class PlaceOrderCmd {
	
	@TargetAggregateIdentifier
	private String orderId;
	private String product;
	
	public PlaceOrderCmd() {}

	public String getOrder_id() {
		return orderId;
	}

	public void setOrder_id(String order_id) {
		this.orderId = order_id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "PlaceOrderCmd [order_id=" + orderId + ", product=" + product + "]";
	}
	
}
