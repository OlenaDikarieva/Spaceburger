package de.fastfood.Spaceburger.controllers;

import de.fastfood.Spaceburger.models.Dish;
import de.fastfood.Spaceburger.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
public class DishController {
    private final DishService dishService;
    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }
    @GetMapping
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }
    @GetMapping("/{id}")
    public Dish getDishById(@PathVariable Long id) {
        return dishService.getDishById(id);
    }
    // Другие методы для обработки запросов
}

