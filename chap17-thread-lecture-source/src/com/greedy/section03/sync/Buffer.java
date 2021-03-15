package com.greedy.section03.sync;

public class Buffer {
	
	private int data;
	private boolean empty = true;
	
	public synchronized void getData() {
		
		/*
		 * data 필드에 값이 없는 동안은 대기 상태이다.
		 * 초기 true인 동안은 무한 루프를 돌며 wait() 메소드를 반복실행
		 */
		
		 while(empty) {
			 try {
				wait();  // --> 깨우려면 notify()를 호출해야만 블럭상태를 빠져나옴
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		 }

		 // data값이 변경되고 상태값이 false로 바뀌게 되면 반복문을 빠져나옴
		 System.out.println("소비자 : " + data + "번 상품 소비했습니다. ");
		 
		 /* 값이 있으면 소비하고, 다시 empty는 true로 바꿔줌 */
		 empty = true;
		 
		 /* 스레드를 다시 실행대기 상태로 만듦 */
		 notify();
	}

	public synchronized void setData(int data) {
		
		/* 현재 값이 있으면 대기상태로, 값이 없으면 값 기록 처리 */
		while(!empty) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
			this.data = data;
			System.out.println("생산자 : " + data + " 상품을 생산하였습니다. ");
			
			/* 해당 메소드 루프는 무한반복으로 돌게하고, 위의 메소드 루프를 나오도록 false로 변경 */
			empty = false;
			
			// 해당 스레드를 다시 실행대기상태로 만듦
			notify();
			
		}
		



}


