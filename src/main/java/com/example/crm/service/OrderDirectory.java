package com.example.crm.service;

import com.example.crm.dao.OrderRepository;
import com.example.crm.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDirectory {
    @Autowired
    private OrderRepository orderRepository;

    public Optional<Order> getOrder(Integer id) {
        return orderRepository.findById(id);
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public void addOrder(Order newOrder) {
        orderRepository.save(newOrder);
    }

    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }

    public void updateOrder(Order orderToUpdate , Integer id) {
        orderRepository.save(orderToUpdate);
    }

    public void patchOrder(Order orderToUpdate , Integer id) {
        Optional<Order> op = orderRepository.findById(id);
        if(op.isPresent()) {
            Order order = op.get();
            order.patch(orderToUpdate);
            orderRepository.save(order);
        }
    }

}
