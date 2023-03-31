package org.example.exercise5;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.exercise1.Person;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainProduct {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Product product = new Product();
        List<Product> products =
                objectMapper.readValue(new File
                                ("src/main/resources/product.json"),
                        new TypeReference<List<Product>>() {
                        });
        System.out.println(products);
    }
}
