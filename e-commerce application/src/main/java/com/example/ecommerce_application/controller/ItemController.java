package com.example.ecommerce_application.controller;

import com.example.ecommerce_application.model.Item;
import com.example.ecommerce_application.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService service;

    @GetMapping("/")
    public List<Item> getAll(){return service.findAll ();}

    @GetMapping("/{id}")
    public Item findById(@PathVariable int id){return service.findById (id);}

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){service.deleteById (id);}

    @PostMapping("/")
    public Item save(@RequestBody Item item){return service.save (item);}

}
