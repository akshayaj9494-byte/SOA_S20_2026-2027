package com.example.Librayanmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {
@Autowired
Repo r;
public String insert(Book b) {
	r.save(b);
	return "Record inserted";
	
}
public List<Book> retrieve() {
	return r.findAll();
}
}
