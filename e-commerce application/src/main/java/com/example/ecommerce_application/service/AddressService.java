package com.example.ecommerce_application.service;

import com.example.ecommerce_application.model.Address;
import com.example.ecommerce_application.repository.AddressRepository;
import com.example.ecommerce_application.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository repository;

    public List<Address>findAll(){return repository.findAll ();}

    public Address findById(int id){return repository.findById (id).get ();}

    public Address save(Address address){
        System.out.println (address);return repository.save (address);}

    public void deleteById(int id){repository.deleteById (id);}
}
