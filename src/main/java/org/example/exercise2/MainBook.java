package org.example.exercise2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.exercise2.Book;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.List;

public class MainBook {
    public static void main(String[] args) throws IOException, ParseException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/book.json");
        Book book = objectMapper.readValue(file, Book.class);
        System.out.println(book);

    }
}
