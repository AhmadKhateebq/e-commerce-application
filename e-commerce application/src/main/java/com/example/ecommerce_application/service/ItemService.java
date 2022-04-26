package com.example.ecommerce_application.service;

import com.example.ecommerce_application.model.Item;
import com.example.ecommerce_application.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository repository;

    public List<Item> findAll() {return repository.findAll ();}

    public Item findById(int id) {return repository.findById (id).get ();}

    public Item save(Item item) {return repository.save (item);}

    public void deleteById(int id) {repository.deleteById (id);}
}
