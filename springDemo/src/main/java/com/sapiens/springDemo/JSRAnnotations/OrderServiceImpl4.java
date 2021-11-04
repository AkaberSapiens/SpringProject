package com.sapiens.springDemo.JSRAnnotations;

public class OrderServiceImpl4 implements OrderService{
    @Override
    public String getOrderService(String orderId) {
        return "Order Details from Impl3 to order id: "+orderId;
    }
}
