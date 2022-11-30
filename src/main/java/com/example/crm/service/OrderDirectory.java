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
}
