package com.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book3")
public class Book {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private String id;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "cover")
  private String cover;
  
  @Column(name = "publisher")
  private String publisher;
 
  @Column(name = "available")
  private boolean available;
//
//  @Column(name = "racknumber")
//  private int rack_number;

public Book(String id, String title, String cover, String publisher, boolean available) {
	super();
	this.id = id;
	this.title = title;
	this.cover = cover;
	this.publisher = publisher;
	this.available = available;
	//this.rack_number = rack_number;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getCover() {
	return cover;
}

public void setCover(String cover) {
	this.cover = cover;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}

public boolean isAvailable() {
	return available;
}

public void setAvailable(boolean available) {
	this.available = available;
}



public Book() {
	super();
	// TODO Auto-generated constructor stub
}


}
