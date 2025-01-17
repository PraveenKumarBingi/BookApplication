package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.book.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
}
