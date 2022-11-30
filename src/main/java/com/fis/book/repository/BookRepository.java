package com.fis.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.fis.book.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
