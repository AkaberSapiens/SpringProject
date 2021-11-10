package com.sapiens.springDemo.JSRAnnotations;

import javax.annotation.Resource;
import java.util.Arrays;

public class OrderServiceClient {
    @Resource(name="OrderServiceB")

    private OrderService orderService;

    public void showPendingOrderDetails(){
        for(String orderId : Arrays.asList("100", "300", "500", "780")){
            System.out.println(orderService.getOrderService(orderId));
        }
    }

}
