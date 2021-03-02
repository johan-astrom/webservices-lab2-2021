package com.johanastrom.booksservice.repositories;

import com.johanastrom.booksservice.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
