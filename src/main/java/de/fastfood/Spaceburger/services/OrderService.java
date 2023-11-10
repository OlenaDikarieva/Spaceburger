package de.fastfood.Spaceburger.services;

import de.fastfood.Spaceburger.models.Dish;
import de.fastfood.Spaceburger.models.Order;
import de.fastfood.Spaceburger.models.OrderStatus;
import de.fastfood.Spaceburger.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final DishService dishService;
    @Autowired
    public OrderService(OrderRepository orderRepository,
                        DishService dishService) {
        this.orderRepository = orderRepository;
        this.dishService = dishService;
    }
    public List<Order> getUserOrders(String userId) {
        return orderRepository.findByUserId(userId);
    }
    public Order createOrder(String userId, List<Long> dishIds) {
        // Получите блюда по их идентификаторам
        List<Dish> selectedDishes = dishIds.stream()
                .map(dishService::getDishById)
                .collect(Collectors.toList());

        // Вычислите общую сумму заказа
        double totalAmount = selectedDishes.stream()
                .mapToDouble(Dish::getPrice)
                .sum();

        // Создайте новый заказ
        Order order = new Order();
        order.setUserId(userId);
        order.setItems(selectedDishes);
        order.setTotalAmount(totalAmount);
        order.setStatus(OrderStatus.NEW); // Установите  начальный статус


        // Сохраните заказ в базе данных
        return orderRepository.save(order);
    }

    // Другие методы для обработки заказов
}