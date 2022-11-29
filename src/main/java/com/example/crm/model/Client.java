package com.example.crm.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String address;
    private String zip_code;
    private String city;
    private String country;
    private boolean state;

}
