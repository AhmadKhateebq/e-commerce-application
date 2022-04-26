package com.example.ecommerce_application.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item_type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
}
