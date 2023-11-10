package de.fastfood.Spaceburger.controllers;

import de.fastfood.Spaceburger.models.Order;
import de.fastfood.Spaceburger.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/{userId}")
    public List<Order> getUserOrders(@PathVariable String userId) {
        return orderService.getUserOrders(userId);
    }
    @PostMapping("/create")
    public Order createOrder(@RequestBody CreateOrderRequest request)
    {
        return orderService.createOrder(request.getUserId(),
                request.getDishIds());
    }

    // Другие методы для обработки заказов
}
