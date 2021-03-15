package com.greedy.section01.thread;

public class Plane implements Runnable{

	@Override
	public void run() { // 인터페이스 구현 가능
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("Plane flight....");
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
