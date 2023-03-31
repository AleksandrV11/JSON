package org.example.exercise3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.exercise2.Book;

import java.io.File;
import java.io.IOException;

public class MainOrder {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/order.json");
        Order order = objectMapper.readValue(file, Order.class);
        System.out.println(order);
    }
}
