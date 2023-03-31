package org.example.exercise1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person();
        List<Person> people =
                objectMapper.readValue(new File
                        ("src/main/resources/person.json"),
                        new TypeReference<List<Person>>() {
                });
        System.out.println(people);

    }
}