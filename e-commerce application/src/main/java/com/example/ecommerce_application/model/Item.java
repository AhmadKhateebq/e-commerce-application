package com.example.ecommerce_application.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "item")
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int type_id;
    int quantity;
}
