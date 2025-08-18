package br.com.gof.facade;

import external.com.subsys1.Stock;
import external.com.subsys2.Payment;
import external.com.subsys3.Dispatch;

public class OrderFacade {
    private final Stock stock = new Stock();
    private final Payment payment = new Payment();
    private final Dispatch dispatch = new Dispatch();

    public OrderFacade(){}

    public void orderProduct(String product){
        this.stock.findProduct(product);
        this.payment.processPayment(product);
        this.dispatch.startTransportation(product);
        System.out.println("Order finished.");
    }
}
