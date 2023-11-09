package edu.qsp.lms.model;

public class Book {
private String bookName;
private String BookAuthor;
private double price;
private String publication;
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return BookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	BookAuthor = bookAuthor;
}
public double getPrice() {
	return price;
}
public void setPrice(double string) {
	this.price = string;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
@Override
public String toString() {
	return "Book [bookName=" + bookName + ", BookAuthor=" + BookAuthor + ", price=" + price + ", publication="
			+ publication + "]";
}

}
