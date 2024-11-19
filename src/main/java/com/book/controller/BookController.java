package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.book.entity.Books;
import com.book.service.BookService;

@Controller
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ModelAndView getBooksData() {
        ModelAndView mav = new ModelAndView();
        List<Books> booksList = bookService.getBooks();
        mav.addObject("books", booksList);
        mav.setViewName("booksView"); // This should match the JSP file name
        return mav;
    }
}
