package com.example.crm.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Client client;
    private String type_presta;
    private String designation;
    private int nb_days;
    private float unit_price;
    private boolean state;
    private float total_exclude_taxe;
    private float total_with_taxe;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getNb_days() {
        return nb_days;
    }

    public void setNb_days(int nb_days) {
        this.nb_days = nb_days;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public float getTotal_exclude_taxe() {
        return total_exclude_taxe;
    }

    public void setTotal_exclude_taxe(float total_exclude_taxe) {
        this.total_exclude_taxe = total_exclude_taxe;
    }

    public float getTotal_with_taxe() {
        return total_with_taxe;
    }

    public void setTotal_with_taxe(float total_with_taxe) {
        this.total_with_taxe = total_with_taxe;
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
                ", total_exclude_taxe=" + total_exclude_taxe +
                ", total_with_taxe=" + total_with_taxe +
                '}';
    }
}
