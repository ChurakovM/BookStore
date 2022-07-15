package com.example.bookservice.models.responses;

import com.example.bookservice.models.BookModel;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetBooksResponse {

    private List<BookModel> books;
}
