package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Books;
import com.book.repository.BooksRepository;

@Service
public class BookService {
	
	@Autowired
	private BooksRepository booksRepo;
	
	public List<Books> getBooks()  {
		List<Books> all = booksRepo.findAll();
		return all;
	}
	
}
