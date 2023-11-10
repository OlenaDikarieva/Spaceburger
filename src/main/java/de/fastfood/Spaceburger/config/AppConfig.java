package de.fastfood.Spaceburger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

/**
 * 10/29/2023
 * AIT Graduation project
 *
 * @author (AIT Graduation project)
 */
@Configuration
@ComponentScan(basePackages = "de.fastfood.Spaceburger")
@PropertySource("classpath:application.properties")
public class AppConfig {

//    @Bean
//    public Scanner scanner() {
//        return new Scanner(System.in);
//    }

}