package de.fastfood.Spaceburger.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




@Entity
@Data
public class Dish {

    @Getter
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Categoria categoria;
    private String name;
    private String description;
    private double price;


}
