package de.fastfood.Spaceburger.repositories;

import de.fastfood.Spaceburger.models.Dish;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long>
{

    // Можно определить кастомные методы для запросов
}
