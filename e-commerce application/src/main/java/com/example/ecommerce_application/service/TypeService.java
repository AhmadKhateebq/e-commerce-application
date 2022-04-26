package com.example.ecommerce_application.service;

import com.example.ecommerce_application.model.Type;
import com.example.ecommerce_application.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    @Autowired
    TypeRepository repository;

    public List<Type> findAll() {return repository.findAll ();}

    public Type findById(int id){return repository.findById (id).get ();}

    public Type save(Type type){return repository.save (type);}

    public void deleteById(int id){repository.deleteById (id);}
}
