package org.example.exercise2;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Book {
    private String title;
    private String author;
    private String published;

}
