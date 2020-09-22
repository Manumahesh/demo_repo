package com.perfaware.events;

public class OrderPlacedEvent {
	
    private String orderId;
    private String product;
    
    public OrderPlacedEvent(String orderId, String product) {
    	this.orderId = orderId;
    	this.product = product;
    }
    
	public String getOrderId() {
		return orderId;
	}
	public String getProduct() {
		return product;
	}
	
	@Override
	public String toString() {
		return "OrderPlacedEvent [orderId=" + orderId + ", product=" + product + "]";
	}

}
