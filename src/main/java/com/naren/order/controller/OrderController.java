package com.naren.order.controller;

import com.naren.order.model.Order;
import com.naren.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customers")
public class OrderController {

    private static final Integer DEFAULT_PAGE_NUMBER = 0;
    private static final Integer DEFAULT_PAGE_SIZE = 25;

    @Autowired
    private OrderService orderService;

    @GetMapping("/createorder")
    public String createOrder(){
        return "Order Creaetd Succsfully";
    }

    @GetMapping("orders")
    public List<Order> listOrders(@RequestParam(value = "pageNumber", required = false) Integer pageNumber,
                                  @RequestParam(value = "pageSize", required = false) Integer pageSize){
    return orderService.getAllOrders();
    }
}
