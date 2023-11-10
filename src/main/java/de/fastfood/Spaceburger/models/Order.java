package de.fastfood.Spaceburger.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId; // Идентификатор пользователя,сделавшего заказ

  private List<Dish> items; // Список блюд в заказе
    private double totalAmount;
    private OrderStatus status; // Перечисление (Новый, Вобработке, Доставляется, Завершен)

    private LocalDateTime orderTime;


    public void setUserId(String userId) {
    }
    // Геттеры и сеттеры
}
