package com.example.crm.controller;

import com.example.crm.model.Order;
import com.example.crm.service.OrderDirectory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class OrderController {
    @Autowired
    private OrderDirectory orderDirectory;

    @GetMapping("orders/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable("id") Integer id) {
        Optional<Order> optionalOrder = orderDirectory.getOrder(id);
        if(optionalOrder.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(optionalOrder.get());
        }
    }

    @GetMapping("orders")
    public List<Order> getOrders() {
        return orderDirectory.getOrders();
    }


}
