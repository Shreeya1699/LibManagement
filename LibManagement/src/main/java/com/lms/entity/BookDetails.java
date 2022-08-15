package com.lms.entity;

import java.util.Calendar;
import java.util.Date;

public class BookDetails {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	private String status;
	private String edition;
	private String dateOfPurchase;
	private int numberOfCopies;
	
	
	
	public BookDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookDetails(String bookName, String bookAuthor, int bookPrice, String status, String edition,
			String dateOfPurchase, int numberOfCopies) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.status = status;
		this.edition = edition;
		this.dateOfPurchase = dateOfPurchase;
		this.numberOfCopies = numberOfCopies;
	}

	public BookDetails(int bookId, String bookName, String bookAuthor, int bookPrice, String status, String edition,
			String dateOfPurchase, int numberOfCopies) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.status = status;
		this.edition = edition;
		this.dateOfPurchase = dateOfPurchase;
		this.numberOfCopies = numberOfCopies;
	}

	//getter (to get the value of object instance) and 
	//setter (to set the value of object instance) methods
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
	//to get a string object representing value of the objects
	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + ", status=" + status + ", edition=" + edition + ", dateOfPurchase="
				+ dateOfPurchase + ", numberOfCopies=" + numberOfCopies + "]";
	}
	
	

}
