package com.example.ecommerce_application.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "address")
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String country;
    String city;
    String area;
    String street;
}
