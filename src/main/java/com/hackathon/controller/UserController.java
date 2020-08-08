package com.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.hackathon.model.Book;
import com.hackathon.model.Order;
import com.hackathon.repository.BookRepository;
import com.hackathon.repository.OrderRepository;
	

	@RestController
	public class UserController {

	@Autowired
	 BookRepository bookRepository;
	 @Autowired
	 OrderRepository orderRepository;





	 
	 @RequestMapping(value = "/getBooks/{title}", method = RequestMethod.GET, produces = "application/json")
	 public List<Book> getBooksByTitle(@PathVariable String title) {
		 
		 List<Book> li = new ArrayList<Book>();

	     bookRepository.findByTitle(title).forEach(li::add);
	     return li;
	      
	  }
	 
//	 @RequestMapping(value = "/getBooksbypublisher/{publisher}", method = RequestMethod.GET, produces = "application/json")
//	 public List<Book> getBooksByPublisher(@PathVariable String publisher) {
//		 
//		 List<Book> li = new ArrayList<Book>();
//
//	     bookRepository.findByPublisher(publisher).forEach(li::add);
//	     return li;
//	      
//	  }
	 
//	 @RequestMapping(value = "/getBooks/{title}", method = RequestMethod.GET, produces = "application/json")
//	 public List<Book> getBooksByTitle(@PathVariable String title) {
//		 
//		 List<Book> li = new ArrayList<Book>();
//
//	     bookRepository.findByTitle(title).forEach(li::add);
//	     return li;
//	      
//	  }
//	 @RequestMapping(value = "/getBooks/{title}", method = RequestMethod.GET, produces = "application/json")
//	 public List<Book> getBooksByTitle(@PathVariable String title) {
//		 
//		 List<Book> li = new ArrayList<Book>();
//
//	     bookRepository.findByTitle(title).forEach(li::add);
//	     return li;
//	      
//	  }
	 /*
	 * This End point is responsible for fetching books that have been borrowed
	 */
	 @RequestMapping(value = "/getBookingDetails", method = RequestMethod.GET,
	 produces = "application/json")
	 public List<Order> getBookingDetails() {
	 List<Order> li = new ArrayList<Order>();
	 orderRepository.findAll().forEach(li::add);
	 return li;
	 }

	/*
	 * This End point is responsible for fetching total number of books.
	 */

	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
	 public long countNoofBooks() {
	 return bookRepository.count();
	 }

	/*
	 * This End point is responsible for adding one or multiple books.
	 */
	 @RequestMapping(value = "/addBook", method = RequestMethod.POST, produces = "application/json")
	 public void addBooks(@RequestBody List<Book> books) {
	 System.out.println(books);
	 bookRepository.saveAll(books);




	}
	 
	 /*
	 * This End point is responsible for deleting existing book.
	 */

	@RequestMapping(value = "/delBook", method = RequestMethod.POST, produces = "application/json")
	 public void delBooks(@RequestBody List<Book> books) {
	 System.out.println(books);
	 bookRepository.deleteAll(books);




	}

	@RequestMapping(value = "/makeBooking", method = RequestMethod.POST,
	 produces = "application/json")
	 public void makeBooking(@RequestBody Order orderDetails) {
	 orderRepository.save(orderDetails);




	}

	@RequestMapping(value = "/cancelBooking", method = RequestMethod.POST,
	 produces = "application/json")
	 public void cancelBooking(@RequestBody String orderDetails) {
	System.out.println(orderDetails.split(":")[0]);
	 orderRepository.deleteByOrderId(orderDetails);




	}


}
