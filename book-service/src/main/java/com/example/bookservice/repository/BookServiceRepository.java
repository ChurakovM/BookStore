package com.example.bookservice.repository;

import com.example.bookservice.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookServiceRepository extends JpaRepository<BookModel, Long>, JpaSpecificationExecutor<BookModel> {

}
