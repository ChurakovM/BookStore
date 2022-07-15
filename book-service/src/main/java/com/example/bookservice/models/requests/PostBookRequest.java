package com.example.bookservice.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBookRequest {

    private String bookName;
    private String author;
    private float price;
    private int quantity;
}
