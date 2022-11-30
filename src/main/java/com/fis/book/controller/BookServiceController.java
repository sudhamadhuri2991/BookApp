package com.fis.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.book.model.Book;
import com.fis.book.service.BookService;



@RestController
@RequestMapping("/")
public class BookServiceController {
	
	@Value("${server.port}")
	public String port;
	
	@Autowired
	BookService bookservice;
	
	@RequestMapping("/books")
	public List<Book> getBooks(){
		
		return bookservice.getBooks();
		
	}
	
	@RequestMapping("/book/{id}")
	public int getBook(@PathVariable("id") int id) {		
		
		return bookservice.getBook(id).getAvailable_copies();
	}
	
	}
