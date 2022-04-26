package com.example.ecommerce_application.controller;

import com.example.ecommerce_application.model.Type;
import com.example.ecommerce_application.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    @Autowired
    TypeService service;

    @GetMapping("/")
    public List<Type> getAll(){return service.findAll ();}

    @GetMapping("/{id}")
    public Type findById(@PathVariable int id){return service.findById (id);}

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){service.deleteById (id);}

    @PostMapping("/")
    public Type save(@RequestBody Type type){return service.save (type);}

}
