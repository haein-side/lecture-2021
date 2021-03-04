package com.greedy.section01.generic;

public class GenericTest<T> {
	
	/*
	 * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성
	 * <> 내부에 작성하는 영문자는 관례상 대문자
	 * 
	 * T는 타입변수라고 불림
	 * 타입변수는 자료형 대신 사용하고 가상으로 존재하는 타입
	 * 그리고 여러 개의 타입변수 작성 시엔 ,를 이용해서 여러 개 기술도 가능
	 */

	/* 현재 해당 필드는 타입이 결정되지 않은 상태 */
	private T value;

	/* setter/getter 작성 시에도 구체적인 타입 대신 T를 이용 가능*/
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
