package com.example.crm.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address", columnDefinition = "TEXT")
    private String address;
    @Column(name = "zip_code")
    private String zip_code;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "state", columnDefinition = "BIT")
    private ClientState state;

    public Client() {

    }

    public Client(String company_name, String first_name, String last_name, String email, String phone, String address, String zip_code, String city, String country, ClientState state) {
        this.company_name = company_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.zip_code = zip_code;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ClientState getState() {
        return state;
    }

    public void setState(ClientState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state=" + state +
                '}';
    }

    public void patch(Client clientToUpdate) {

        if(clientToUpdate.getCompany_name() != null) {
            this.company_name = clientToUpdate.getCompany_name();
        }

        if(clientToUpdate.getFirst_name() != null) {
            this.first_name = clientToUpdate.getFirst_name();
        }
        if(clientToUpdate.getLast_name() != null) {
            this.last_name = clientToUpdate.getLast_name();
        }
        if(clientToUpdate.getEmail() != null) {
            this.email = clientToUpdate.getEmail();
        }
        if(clientToUpdate.getPhone() != null) {
            this.phone = clientToUpdate.getPhone();
        }
        if(clientToUpdate.getAddress() != null) {
            this.address = clientToUpdate.getAddress();
        }
        if (clientToUpdate.getZip_code() != null) {
            this.zip_code = clientToUpdate.getZip_code();
        }
        if (clientToUpdate.getCity() != null) {
            this.city = clientToUpdate.getCity();
        }
        if (clientToUpdate.getCountry() != null) {
            this.country = clientToUpdate.getCountry();
        }

        if (clientToUpdate.getState() != null) {
            this.state = clientToUpdate.getState();
        }
    }
}
