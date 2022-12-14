package com.example.crm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Client client;
    @Column(name="type_presta")
    private String type_presta;
    @Column(name="designation")
    private String designation;
    @Column(name="nb_days")
    private Integer nb_days;
    @Column(name="unit_price")
    private Float unit_price;
    @Column(name="state" , columnDefinition = "BIT")
    private OrderState state;

    public Order() {
    }

    public Order(Client client, String type_presta, String designation, Integer nb_days, Float unit_price, OrderState state) {
        this.client = client;
        this.type_presta = type_presta;
        this.designation = designation;
        this.nb_days = nb_days;
        this.unit_price = unit_price;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getType_presta() {
        return type_presta;
    }

    public void setType_presta(String type_presta) {
        this.type_presta = type_presta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getNb_days() {
        return nb_days;
    }

    public void setNb_days(Integer nb_days) {
        this.nb_days = nb_days;
    }

    public Float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Float unit_price) {
        this.unit_price = unit_price;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }



    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", type_presta='" + type_presta + '\'' +
                ", designation='" + designation + '\'' +
                ", nb_days=" + nb_days +
                ", unit_price=" + unit_price +
                ", state=" + state +
                               '}';
    }

    public void patch(Order orderToUpdate) {
        if(orderToUpdate.getClient() != null) {
            this.client = orderToUpdate.getClient();
        }
        if(orderToUpdate.getType_presta() != null) {
            this.type_presta = orderToUpdate.getType_presta();
        }
        if(orderToUpdate.getDesignation() !=null) {
            this.designation = orderToUpdate.getDesignation();
        }
        if (orderToUpdate.getNb_days() != null) {
            this.nb_days = orderToUpdate.getNb_days();
        }
        if(orderToUpdate.getUnit_price() != null) {
            this.unit_price = orderToUpdate.getUnit_price();
        }
        if(orderToUpdate.getState() != null) {
            this.state = orderToUpdate.getState();
        }
    }
}
