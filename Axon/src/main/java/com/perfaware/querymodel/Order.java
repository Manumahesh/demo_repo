package com.perfaware.querymodel;

public class Order {

	private final String orderId;
	private final String product;
	private OrderStatus orderStatus;

	public Order(String orderId, String product) {
		this.orderId = orderId;
		this.product = product;
		orderStatus = OrderStatus.PLACED;
	}

	public void setOrderConfirmed() {
		this.orderStatus = OrderStatus.CONFIRMED;
	}

	public void setOrderShipped() {
		this.orderStatus = OrderStatus.SHIPPED;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getProduct() {
		return product;
	}
	
}
