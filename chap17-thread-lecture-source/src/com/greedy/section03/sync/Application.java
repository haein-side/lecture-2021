package com.greedy.section03.sync;

public class Application {

	public static void main(String[] args) {
		
		/* 공유 자원 인스턴스 생성 */
		Buffer buffer = new Buffer();
		
		/* 동일한 버퍼 인스턴스를 공유하는 생산자와 소비자 스레드 생성 */
		Thread t1 = new Producer(buffer); // buffer와 동일한 것을 공유
		Thread t2 = new Producer(buffer); 
		
		t1.start();
		t2.start();
		
	}
}
