package com.greedy.section02.daemonthread;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 데몬은 리눅스, 유닉스 계열의 *운영체제에서 백그라운드*에서 동작하는 프로그램을 말함
		 * 이와 비슷하게 동작하도록 만든 것을 데몬스레드라고 함
		 * 메인 쓰레도가 종료되어도 쓰레드의 실행 내용을 마저 실행함
		 * 데몬 쓰레드로 생성한 스레드를 등록하면 메인 스레드가 종료될 때 데몬스레드도 종료 (같이 종료 bec. 보조스레드이기 때문)
		 * 
		 * 스레드 메소드 start()
		 * 스레드 실행하는 방법 2가지 Runnable 객체 : 매개변수 생성자를 통해 Thread 생성
		 */
		
		Thread t = new CountDown();
		
		/* 데몬스레드를 쓰기 위해서는 start()를 호출하기 전에 데몬 스레드를 사용하겠다고 설정을 해주어야 함 */
		t.setDaemon(true);

		t.start();
		
		System.out.println(JOptionPane.showInputDialog("아무 문자열이나 입력해보세요"));
		
		System.out.println("메인스레드 종료");
	}
}
