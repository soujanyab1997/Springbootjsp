package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.model.Book;
import com.capg.model.Library;
import com.capg.service.Serviceimpl;

@Controller
public class Bookcontroller {
	@Autowired
	Serviceimpl serviceimpl;
	
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping(value="/addBook",method=RequestMethod.POST)
	public ModelAndView addBook(Library library,Book book)
	{			
		ModelAndView mv=new ModelAndView("Added.jsp");
		book.setLibrary(library);
		library.getBook().add(book);	
		Library lib=
				serviceimpl.add(library);
		mv.addObject(lib);
		return mv;
		
	}
	@RequestMapping(value="/deleteLibrary",method=RequestMethod.GET)
	public String deleteLibrary(@RequestParam int libraryid) 
	{
		serviceimpl.deleteLibrary(libraryid);
		return "Deleted.jsp";
	}
	
	@RequestMapping(value="/deleteBook",method=RequestMethod.GET)
	public String deleteBook(@RequestParam int bookid) 
	{
		serviceimpl.deleteBook(bookid);
		return "DeletedBook.jsp";
	}
	
	
	
	@RequestMapping(value="/searchBook",method=RequestMethod.GET)
	public ModelAndView searchBook(@RequestParam int libraryid,@RequestParam int bookid) 
	{
		ModelAndView mv=new ModelAndView("SearchedLib.jsp");
		Library library=serviceimpl.findBook(libraryid);
		Book book=serviceimpl.findBookId(bookid);
		mv.addObject(library);
		mv.addObject(book);
		return mv;
	}
	@RequestMapping(value="/updateBook",method=RequestMethod.POST)
	public String updateBook(Book book) {
		Book b=serviceimpl.findBookId(book.getBookid());
		if(book.getBookname()!="")
			b.setBookname(book.getBookname());
		if(book.getBookauthor()!="")
			b.setBookauthor(book.getBookauthor());
		if(book.getBookpublisher()!="")
			b.setBookpublisher(book.getBookpublisher());
		serviceimpl.updateBook(b);
		return "redirect:/";
			}

}
