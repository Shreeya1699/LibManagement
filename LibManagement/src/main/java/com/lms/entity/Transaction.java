package com.lms.entity;
import java.util.Calendar;
import java.util.Date;

public class Transaction {

	private int transactionId;
	private int userId;
	private int bookId;
	private String dateOfIssue;
	private String dueDate;
	private String transactionStatus;
	private int fine;
	
	
	public Transaction(int userId, int bookId, String dateOfIssue, String dueDate) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.dateOfIssue = dateOfIssue;
		this.dueDate = dueDate;
	}
	public Transaction(int userId, int bookId, String dateOfIssue, String dueDate, String transactionStatus, int fine) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.dateOfIssue = dateOfIssue;
		this.dueDate = dueDate;
		this.transactionStatus = transactionStatus;
		this.fine = fine;
	}
	//getter (to get the value of object instance) and 
	//setter (to set the value of object instance) methods
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	
	
	//to get a string object representing value of the objects
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", userId=" + userId + ", bookId=" + bookId
				+ ", dateOfIssue=" + dateOfIssue + ", dueDate=" + dueDate + ", transactionStatus=" + transactionStatus
				+ ", fine=" + fine + "]";
	}
	
	
	
}
