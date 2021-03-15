package com.greedy.section01.thread;

public class Car extends Thread {

	/* Thread 클래스를 상속받아 구현 */
	
	/* run()을 또다른 흐름의 메인메소드라고 생각하면 좀 수월 */
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Car driving....");
			
			try { 
				/* Thread를 잠시 지연시키는 메소드 */
				Thread.sleep(1); //1초 동안 잠시 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}
