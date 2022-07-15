package com.example.bookservice.controllers;

import com.example.bookservice.models.requests.PostBookRequest;
import com.example.bookservice.models.responses.GetBookResponse;
import com.example.bookservice.models.responses.GetBooksResponse;
import com.example.bookservice.models.responses.PostBookResponse;
import com.example.bookservice.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("books") // http://localhost:[PORT]/books
public class BookServiceController {

    private static final String BOOK_ID_PATH = "/{bookId}";
    private final BookService bookService;

    @PostMapping()
    public ResponseEntity<PostBookResponse> addBook(@RequestBody PostBookRequest request) {
        PostBookResponse response = bookService.addBook(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<GetBooksResponse> getAllBooks() {
        GetBooksResponse response = bookService.getBooks();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = BOOK_ID_PATH)
    public ResponseEntity<GetBookResponse> getBook(String bookId) {
        GetBookResponse response = bookService.getBook(bookId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
