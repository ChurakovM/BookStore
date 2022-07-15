package com.example.bookservice.models;

import java.util.concurrent.atomic.AtomicInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@Entity
@Table(name = "books")
public class BookModel {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;

    @Column(nullable = false, length = 70)
    private String bookName;

    @Column(nullable = false, length = 70)
    private String author;

    @Column(nullable = false, length = 5)
    private float price;

    @Column(nullable = false, length = 4)
    private int quantity;
}
