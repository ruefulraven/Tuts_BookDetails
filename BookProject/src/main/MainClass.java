package main;

public class MainClass {
/*
 * Create 2 class
 * 1main //
 * 1class //
 * CRUD
 * Create
 * -Book Name
 * -Book Author
 * -Book Price
 * -Book Publisher
 * -Book Genre
 * Read
 * Update
 * Delete
 * */
	public static void main(String[] args) {
		//Object/Class initialization
		//ClassName variableName = new ClassName();
		BookDetails bookDetails = new BookDetails("Harry Potter", "JK Rowling", 45.45, "National Bookstore", "Fiction");
		BookDetails bookDetails1 = new BookDetails("Harry Potter II", "JK Rowling", 45.45, "National Bookstore", "Fiction");
		BookDetails bookDetails2 = new BookDetails("Harry Potter III", "JK Rowling", 45.45, "National Bookstore", "Fiction");
		System.out.println(bookDetails2);
	}

}
