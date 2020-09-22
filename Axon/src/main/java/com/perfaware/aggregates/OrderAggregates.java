package com.perfaware.aggregates;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.perfaware.cmds.ConfirmOrderCmd;
import com.perfaware.cmds.PlaceOrderCmd;
import com.perfaware.events.ConfirmedOrder;
import com.perfaware.events.OrderPlacedEvent;

@Aggregate
public class OrderAggregates {

	@AggregateIdentifier
	private String orderId;
	private boolean orderConfirmed;
	
	@CommandHandler
    public OrderAggregates(PlaceOrderCmd command) {
        AggregateLifecycle.apply(new OrderPlacedEvent(command.getOrder_id(), command.getProduct()));
    }
	
	@CommandHandler
	public void handle(ConfirmOrderCmd command) { 
		AggregateLifecycle.apply(new ConfirmedOrder(orderId)); 
	}
 
    @EventSourcingHandler
    public void on(OrderPlacedEvent event) {
        this.orderId = event.getOrderId();
        orderConfirmed = false;
    }
    
    @EventSourcingHandler
    public void on(ConfirmedOrder event) { 
        orderConfirmed = true; 
    }
 
    protected OrderAggregates() { }
	
}
