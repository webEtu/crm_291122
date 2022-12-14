package com.example.crm.controller;

import com.example.crm.model.Order;
import com.example.crm.service.OrderDirectory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if (optionalOrder.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(optionalOrder.get());
        }
    }

    @GetMapping("orders")
    public List<Order> getOrders() {
        return orderDirectory.getOrders();
    }

//******


    @DeleteMapping("orders/{id}")
    public void deleteOrder(@PathVariable("id") Integer id) {
        orderDirectory.deleteOrder(id);
    }

    @PutMapping("orders/{id}")
    public ResponseEntity updateOrder(@RequestBody Order order, @PathVariable("id") Integer id) {
        if(id != order.getId()) {
            return ResponseEntity.badRequest().build();
        } else {
            orderDirectory.updateOrder(order , id);
            return ResponseEntity.ok().build();
        }
    }


    @PatchMapping("orders/{id}")
    public void patchOrder(@RequestBody Order order , @PathVariable("id") Integer id) {
        orderDirectory.patchOrder(order , id);
    }
}
