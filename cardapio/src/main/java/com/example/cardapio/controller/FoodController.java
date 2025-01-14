package com.example.cardapio.controller;


import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private FoodRepository repository;

    @Autowired
    public FoodController(FoodRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Food> getAllFoods(){
        return repository.findAll();
    }
}




