package com.example.ecommerce_application.controller;

import com.example.ecommerce_application.model.Address;
import com.example.ecommerce_application.model.Type;
import com.example.ecommerce_application.service.AddressService;
import com.example.ecommerce_application.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService service;

    @GetMapping("/")
    public List<Address> getAll(){return service.findAll ();}

    @GetMapping("/{id}")
    public Address findById(@PathVariable int id){return service.findById (id);}

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){service.deleteById (id);}

    @PostMapping("/")
    public Address save(@RequestBody Address address){return service.save (address);}

}
