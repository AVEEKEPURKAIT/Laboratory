package com.ems.entity;

public class Book {
private long bookId;
private String bookName;
private String bookauthor;
private String bookpublisher; 
private double bookcode;
private double bookprice;
Address address;//has a relationship
public Book(long bookId, String bookName, String bookauthor, String bookpublisher, double bookcode, double bookprice,
		Address address) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookauthor = bookauthor;
	this.bookpublisher = bookpublisher;
	this.bookcode = bookcode;
	this.bookprice = bookprice;
	this.address = address;
}
public long getBookId() {
	return bookId;
}
public String getBookName() {
	return bookName;
}
public String getBookauthor() {
	return bookauthor;
}
public String getBookpublisher() {
	return bookpublisher;
}
public double getBookcode() {
	return bookcode;
}
public double getBookprice() {
	return bookprice;
}
public Address getAddress() {
	return address;
}



}




