package org.example.exercise4;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.exercise3.Order;

import java.io.File;
import java.io.IOException;

public class MainUser {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/user.json");
        User user = objectMapper.readValue(file, User.class);
        System.out.println(user);
    }
}
