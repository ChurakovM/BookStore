package com.example.bookservice.services;

import com.example.bookservice.mappers.BookMapper;
import com.example.bookservice.models.BookModel;
import com.example.bookservice.models.requests.PostBookRequest;
import com.example.bookservice.models.responses.GetBookResponse;
import com.example.bookservice.models.responses.GetBooksResponse;
import com.example.bookservice.models.responses.PostBookResponse;
import com.example.bookservice.repository.BookServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookServiceRepository bookServiceRepository;
    private final BookMapper bookMapper;

    public PostBookResponse addBook(PostBookRequest request) {
        BookModel bookModel = bookMapper.postBookRequestToBookModel(request);
        bookServiceRepository.save(bookModel);
        return bookMapper.bookModelToPostBookResponse(bookModel);
    }

    public GetBooksResponse getBooks() {
        GetBooksResponse response = new GetBooksResponse();
        response.setBooks(bookServiceRepository.findAll());
        return response;
    }

    public GetBookResponse getBook(String bookId) {
        BookModel bookModel = bookServiceRepository
            .findById(Long.valueOf(bookId))
            .orElseThrow();
        return bookMapper.bookModelToGetBookResponse(bookModel);
    }
}
