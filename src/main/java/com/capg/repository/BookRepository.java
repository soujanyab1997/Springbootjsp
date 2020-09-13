package com.capg.repository;

import org.springframework.data.repository.CrudRepository;

import com.capg.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
