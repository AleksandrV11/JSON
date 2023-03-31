package org.example.exercise5;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private String id;
    private String name;
    private int price;
    private String description;
    private List<Review> reviews;
}
