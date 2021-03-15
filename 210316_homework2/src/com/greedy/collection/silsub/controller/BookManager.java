package com.greedy.collection.silsub.controller;

import java.util.ArrayList;

import com.greedy.collection.silsub.model.vo.BookVO;


public class BookManager {

	ArrayList<BookVO> bookList = new ArrayList<>();
	
	public BookManager() {}
	
	public void addbook(BookVO book) {
		bookList.add(book);
	}
	
	public void deleteBook(int index) {
		bookList.remove(index);
	}
	
	public int searchBook(String title) {
		if (title ==  BookMenu.title) {
			return bookList.index();
		} else {
			bookList.index() = -1;
			return bookList.index();
		}
	}
	
	public void printBook(int index) {
		System.out.println(new BookVO(int category, String title, String author));
	}
	
	public ArrayList<BookVO> displayAll() {
		bookList.displayAll();
	}
	
	public BookVO[] sortedBookList(int select) {
		if (select == 1) {
			
		} else {
			
		}
	}
	
	
	public void printBookList(BookVO br) {
		for(BookVO br : bookList) { //  book은 임의로 만들어준 BookVO 타입 변수
			System.out.println(br);
		}
	}
	
	
}
