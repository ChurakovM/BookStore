package com.example.bookservice.models.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBookResponse {

    private String id;
    private String bookName;
    private String author;
    private float price;
    private int quantity;
}
