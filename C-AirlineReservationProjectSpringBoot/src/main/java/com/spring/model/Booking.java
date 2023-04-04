package com.spring.model;

public class Booking {
	
	private int BookId;
	private String destination;
	private String dep_time;
	private String arr_time;
	private String date;
	private String origin;
	
	public Booking() {
		
	}
	public Booking(int bookId, String destination, String dep_time, String arr_time, String date, String origin) {
		super();
		BookId = bookId;
		this.destination = destination;
		this.dep_time = dep_time;
		this.arr_time = arr_time;
		this.date = date;
		this.origin = origin;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDep_time() {
		return dep_time;
	}
	public void setDep_time(String dep_time) {
		this.dep_time = dep_time;
	}
	public String getArr_time() {
		return arr_time;
	}
	public void setArr_time(String arr_time) {
		this.arr_time = arr_time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Booking [BookId=" + BookId + ", destination=" + destination + ", dep_time=" + dep_time + ", arr_time="
				+ arr_time + ", date=" + date + ", origin=" + origin + "]";
	}
	
	
	
	

}
