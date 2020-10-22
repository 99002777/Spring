package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDAO;
import com.bookapp.model.Book;
@Service

public class BookServiceImpl implements BookService {
	@Autowired
	BookDAO bookDAo ;

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAo.getAllBooks();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAo.getByAuthor(author);
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookDAo.getByCategory(category);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAo.getById(id);
	}

}
