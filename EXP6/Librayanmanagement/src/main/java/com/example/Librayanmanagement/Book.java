package com.example.Librayanmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Book {
	@Id
 int bid;
 String title;
 String author;
 String isbin;
 public int getBid() {
	return bid;
 }
 public void setBid(int bid) {
	this.bid = bid;
 }
 public String getTitle() {
	return title;
 }
 public void setTitle(String title) {
	this.title = title;
 }
 public String getAuthor() {
	return author;
 }
 public void setAuthor(String author) {
	this.author = author;
 }
 public String getIsbin() {
	return isbin;
 }
 public void setIsbin(String isbin) {
	this.isbin = isbin;
 }
 @Override
 public String toString() {
	return "Book [bid=" + bid + ", title=" + title + ", author=" + author + ", isbin=" + isbin + "]";
 }
 public Book(int bid, String title, String author, String isbin) {
	super();
	this.bid = bid;
	this.title = title;
	this.author = author;
	this.isbin = isbin;
 }
 public Book() {
	super();
	// TODO Auto-generated constructor stub
 }
 
}
