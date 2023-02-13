package com.ems.service;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;

import com.ems.entity.Address;
import com.ems.entity.Book;

public class Bookservice {
private List<Book> book=new ArrayList<>();
public void addBook(long bookId, String bookName, String bookauthor, String bookpublisher, double bookcode, double bookprice)
{
	book.add(new Book(bookId, bookName, bookauthor, bookpublisher, bookcode, bookprice, null));
}
public List<Book> displayAll()
{
	return book;
}
public int lengthofList()
{
	return book.size();
}
}