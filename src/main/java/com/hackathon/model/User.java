package com.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;
  
  @Column(name = "user_name", nullable = false)
  private String name;
  
  @Column(name = "password1", nullable = false)
  private String password;
  
  @Column(name = "first_name", nullable = false)
  private String fname;
  
  @Column(name = "last_name", nullable = false)
  private String lname;
  
  public User() {
	super();
	// TODO Auto-generated constructor stub
}


@Column(name = "role1", nullable = false)
  private String role;
  
  @Column(name = "isenabled", nullable = false)
  private boolean isenabled;
  
  
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", password=" + password + ", fname=" + fname + ", lname=" + lname
			+ ", role=" + role + ", isenabled=" + isenabled + "]";
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}


public boolean isIsenabled() {
	return isenabled;
}


public void setIsenabled(boolean isenabled) {
	this.isenabled = isenabled;
}


public User(String id, String name, String password, String fname, String lname, String role, boolean isenabled) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.fname = fname;
	this.lname = lname;
	this.role = role;
	this.isenabled = isenabled;
}


 

}