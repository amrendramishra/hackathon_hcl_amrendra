package com.hackathon.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Entity
@Table(name = "order_details1")
public class Order  {

//  @Id @GeneratedValue(generator="system-uuid")
//  @GenericGenerator(name="system-uuid", strategy = "uuid")
//  @Column(name = "booking_id")
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
  private String booking_id;
  
 public Order(String booking_id, Date booking_date, int quantity) {
	super();
	this.booking_id = booking_id;
	this.booking_date = booking_date;
	this.quantity = quantity;
}

public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public String getBooking_id() {
	return booking_id;
}

public void setBooking_id(String booking_id) {
	this.booking_id = booking_id;
}

public Date getBooking_date() {
	return booking_date;
}

public void setBooking_date(Date booking_date) {
	this.booking_date = booking_date;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Column(name = "booking_date")
  private Date booking_date;

@Column(name = "quantity")
  private int quantity;
 

  


 

}
