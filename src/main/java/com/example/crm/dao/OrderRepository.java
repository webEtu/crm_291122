package com.example.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order , Integer> {

}
