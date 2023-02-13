package com.emp.maven_bookmanagement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ems.service.Bookservice;

class Bookservicetest {
Bookservice bookService;
@BeforeEach
void setup()
{
	bookService=new Bookservice();
}
@AfterEach
void cleanup()
{
	bookService=null;
	System.out.println("object is garbaje collected");
	}
	@Test
	@DisplayName("Test for add Book Method")
	public void addBookservicetest()
	{
		bookService.addBook(101, "The Guide", "R.K Narayan", "Narayan publishers", 311, 550);
		bookService.addBook(102, "The Aim Of Life", "Bilal Alaji", "Bilal Publishers", 325, 1500);
	assertEquals(2, bookService.lengthofList());
	}
	@Test
	@DisplayName("Test for Display All Employee")
	public void testDisplayAll()
	{
		bookService.addBook(101, "The Guide", "R.K Narayan", "Narayan publishers", 311, 550);
		assertThat(bookService.displayAll()).isNotNull();
	
	}

}
