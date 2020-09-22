package com.perfaware.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import com.perfaware.events.ConfirmedOrder;
import com.perfaware.events.OrderPlacedEvent;
import com.perfaware.querymodel.Order;

@Service
public class OrderedProductsEventHandler {

	private final Map<String, Order> orderedProducts = new HashMap<>();

	@EventHandler
	public void on(OrderPlacedEvent event) {
		String orderId = event.getOrderId();
		orderedProducts.put(orderId, new Order(orderId, event.getProduct()));
	}

	@EventHandler
	public void on(ConfirmedOrder event) {
		orderedProducts.computeIfPresent(event.getOrderId(), (orderId, orderedProduct) -> {
			orderedProduct.setOrderConfirmed();
			return orderedProduct;
		});
	}
	
	@QueryHandler
    public List<Order> handle(FindAllOrderedProductsQuery query) {
        return new ArrayList<>(orderedProducts.values());
    }
}
