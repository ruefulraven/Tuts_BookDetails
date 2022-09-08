package main;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BookDetails {

	//Encapsulation. 1 of OOP Concepts, basically keeping the fields private so that user cant directly access it.
	//Below are Class Variables
	String bookName;
	String bookAuthor;
	double bookPrice;
	String bookPublisher;
	String bookGenre;
	
	//From Main class -> BookDetails -> Book
	//List, similar sya kay Array pero mas powerful
	//BookDetails[] database = null;
	static List<Book> database = new ArrayList<>();
	
	public BookDetails(String bookName, String bookAuthor, double bookPrice, String bookPublisher, String bookGenre) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
		this.bookGenre = bookGenre;
		
		Book book = new Book(bookName, bookAuthor, bookPrice, bookPublisher, bookGenre);
		database = storeBookDetails(book);
		
	}

	public String getBookName() {
		return bookName;
	}
	//Below are method Variable
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	
	public static List<Book> storeBookDetails(Book tempBook) {
		database.add(tempBook);
		return  database;
	}

	@Override
	public String toString() {
		return database.toString();
	}
	
	
	
}
