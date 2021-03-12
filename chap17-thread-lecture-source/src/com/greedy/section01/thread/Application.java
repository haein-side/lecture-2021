package com.greedy.section01.thread;

public class Application {
	public static void main(String[] args) {
	
		/*
		 * 프로세스와 스레드
		 * 
		 * 프로세스(process)란 실행 중인 프로그램
		 * 즉, 사용자가 작성한 프로그램을 운영체제에 의해 메모리와 cup를 할당받아 실행 중인 것
		 * 
		 * 스레드(thread)란 프로세스 내에서 실제로 작업을 수행하는 주체 (작업 단위)
		 * 모든 프로세스에는 한 개 이상의 스레드가 존재하고
		 * 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드라 함
		 */
	
		/*
		 * 스레드를 생성하는 법
		 * 1. Thread 클래스를 상속받는 방법
		 * 2. Runnable 인터페이스를 상속받는 방법
		 */
	
		Car car = new Car();
		Tank tank = new Tank();
		Plane plane = new Plane();
		
		/* Thread 타입의 인스턴스로 변환 */
		Thread t1 = car;		//car, tank는 모두 Thread를 상속받고 있기에 가능
		Thread t2 = tank;
		
		/* Runnable을 상속받은 클래스는 Thread 클래스의 생성자에 인자로 인스턴스를 전달해서 Thread 인스턴스를 생성 */
		Thread t3 = new Thread(plane); 
		
		/* 다형성 적용해서 Thread 타입으로 바로 인스턴스 생성 가능 */
		Thread t4 = new Car();		
		Thread t5 = new Tank();
		Thread t6 = new Thread(plane);
		
		// Thread는 기본적으로 1~10의 우선순위 중 5의 우선순위를 갖고 있다.
		System.out.println("t4의 우선순위 : " + t4.getPriority());
		System.out.println("t5의 우선순위 : " + t5.getPriority());
		System.out.println("t6의 우선순위 : " + t6.getPriority());
		
		t4.setPriority(Thread.MAX_PRIORITY); // 10
		t6.setPriority(Thread.MIN_PRIORITY); // 1
		
		System.out.println("t4의 우선순위 : " + t4.getPriority());
		System.out.println("t5의 우선순위 : " + t5.getPriority());
		System.out.println("t6의 우선순위 : " + t6.getPriority());
		
		
		/* run()메소드를 호출 시 스레드 아닌 메소드 호출 방식으로 동작 */
//		t4.run();
//		t5.run();
//		t6.run();
		
		/* Thread 동작시키기 위해 start() 메소드를 호출 */
		t4.start();
		t5.start();
		t6.start();
		
		// 지정한 Thread가 종료될 때가지 현재 메인 쓰레드의 종료를 대기시킴
		try {
			t4.join();
			t5.join();
			t6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("============================ main end!!");
	}
}
