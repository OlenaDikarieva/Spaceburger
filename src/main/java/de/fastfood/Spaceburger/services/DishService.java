package de.fastfood.Spaceburger.services;

import de.fastfood.Spaceburger.models.Dish;
import de.fastfood.Spaceburger.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    private final DishRepository dishRepository;
    @Autowired
    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }
    public Dish getDishById(Long id) {
        return dishRepository.findById(id).orElse(null);
    }
    // Другие методы
}
