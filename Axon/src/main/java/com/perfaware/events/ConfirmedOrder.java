package com.perfaware.events;

public class ConfirmedOrder {
	
	private String orderId;
	
	public ConfirmedOrder(String orderId) {
		this.orderId = orderId;
	}
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "ConfirmedOrder [orderId=" + orderId + "]";
	}
}
