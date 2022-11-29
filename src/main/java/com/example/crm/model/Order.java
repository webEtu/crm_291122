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

}
