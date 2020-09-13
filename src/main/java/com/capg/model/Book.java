package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
@Id
private int bookid;
private String bookname;
private String bookauthor;
private String bookpublisher;
@ManyToOne
private Library library;
public Book() {
	super();
}
public Book(int bookid, String bookname, String bookauthor, String bookpublisher, Library library) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.bookauthor = bookauthor;
	this.bookpublisher = bookpublisher;
	this.library = library;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
public String getBookpublisher() {
	return bookpublisher;
}
public void setBookpublisher(String bookpublisher) {
	this.bookpublisher = bookpublisher;
}
public Library getLibrary() {
	return library;
}
public void setLibrary(Library library) {
	this.library = library;
}

}
