package com.capg.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
@Id
private int libraryid;
private String libraryname;
@OneToMany(mappedBy="library",cascade=CascadeType.ALL)
List<Book> book=new ArrayList<Book>();
public Library() {
	super();
}
public Library(int libraryid, String libraryname, List<Book> book) {
	super();
	this.libraryid = libraryid;
	this.libraryname = libraryname;
	this.book = book;
}
public int getLibraryid() {
	return libraryid;
}
public void setLibraryid(int libraryid) {
	this.libraryid = libraryid;
}
public String getLibraryname() {
	return libraryname;
}
public void setLibraryname(String libraryname) {
	this.libraryname = libraryname;
}
public List<Book> getBook() {
	return book;
}
public void setBook(List<Book> book) {
	this.book = book;
}


}
