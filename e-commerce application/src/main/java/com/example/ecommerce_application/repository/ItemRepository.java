package com.example.ecommerce_application.repository;

import com.example.ecommerce_application.model.Item;
import com.example.ecommerce_application.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
