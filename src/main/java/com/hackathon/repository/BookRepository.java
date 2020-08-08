package com.hackathon.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.hackathon.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);
// List<Book> findBook(String criteria, String type);

	//List<Book> findByPublisher(String publisher);

	Iterable<Book> findByPublisher(String publisher);
}
