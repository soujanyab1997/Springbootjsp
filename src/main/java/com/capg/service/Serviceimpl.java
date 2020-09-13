package com.capg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.model.Book;
import com.capg.model.Library;
import com.capg.repository.BookRepository;
import com.capg.repository.LibraryRepository;

@Service
public class Serviceimpl {
@Autowired BookRepository bookrepo;
@Autowired LibraryRepository libraryrepo;

public Library add(Library library)
{
	return libraryrepo.save(library);
	
}
public void deleteLibrary(Integer libraryid)
{
	Library l =findBook(libraryid);
	libraryrepo.delete(l);
	}

public void deleteBook(Integer bookid)
{
	Book b =findBookId(bookid);
	bookrepo.delete(b);
}
public Library findBook(Integer libraryid) { 
	
	Optional<Library> optional =libraryrepo.findById(libraryid);
	Library library=optional.get();
	return library;
}
public Book findBookId(Integer bookid) { 
		
		Optional<Book> optional =bookrepo.findById(bookid);
		Book book=optional.get();
		return book;
							 
}
public Book updateBook(Book book) {
return bookrepo.save(book);
}
}
