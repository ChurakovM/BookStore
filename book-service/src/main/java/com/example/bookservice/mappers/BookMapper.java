package com.example.bookservice.mappers;

import com.example.bookservice.models.BookModel;
import com.example.bookservice.models.requests.PostBookRequest;
import com.example.bookservice.models.responses.GetBookResponse;
import com.example.bookservice.models.responses.PostBookResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface BookMapper {

    @Mapping(target = "id", ignore = true)
    BookModel postBookRequestToBookModel(PostBookRequest request);

    PostBookResponse bookModelToPostBookResponse(BookModel bookModel);

    GetBookResponse bookModelToGetBookResponse(BookModel bookModel);
}
