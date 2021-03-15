package com.greedy.collection.silsub.model.vo;

public class BookVO {

	private int bNo;
	private int category;
	private String title;
	private String author;
	
	public BookVO() {}
	
	public void setBNo(int bNo) {
		this.bNo = bNo;
	}
	
	public int getBNo() {
		return bNo;
	}
	
	public void setCategory(int category) {
		this.category = category;
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}



	public void BookList(int bNo, int category, String title, String author) {
		
		System.out.println("BookVO [도서번호 : " + bNo + ", 도서분류코드 : " + category + ", 도서 제목 : " + author + ", 도서 저자 : " + author + "]");
		
	}

	@Override
	public String toString() {
		return "BookVO [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}

	
	



}
