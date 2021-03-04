package com.greedy.section02.extend;

/* 인터페이스 상속 시 implements 키워드 대신 extends 사용 */
//public class RabbitFarm<T implements Animal> { //에러남
//public class RabbitFarm<T extends Animal> { //정상

// 클래스 상속 시 extends 사용 가능
// 인터페이스 상속 시에도 extends 사용 (원래 인터페이스 상속 시 implement)
//public class RabbitFarm<T extends Rabbit> {

	/*
	 * 클래스와 인터페이스 상속 시 & 사용
	 * -> 대신 앞에는 클래스 오고 뒤에 인터페이스가 옴
	 * &로 여러 타입을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여김.
	 * (둘 중 하나가 아님! - 모든 타입을 가지고 있어야)
	 * 
	 * 클래스 여러개는 & 사용 불가하고 (,)콤마를 사용 시 컴파일 에러 발생하지 않지만
	 * 뒤에 작성한 클래스를 또 하나의 다른 타입변수로 본다.
	 * -> 하나의 클래스만 상속받아 구현 가능
	 */
	
	
//public class RabbitFarm<T extends Rabbit & Animal> {
								//& 앞에는 클래스, 뒤엔 인터페이스

//Reptile 자체를 타입변수로 봄
//public class RabbitFarm<T extends Rabbit,Reptile> {


/**
 * @author kim
 *
 * @param <T>
 */
public class RabbitFarm<T extends Rabbit> {
	
	// 타입변수 T는 아직 어떤 토끼가 될 지 모름
	// 토끼이거나 토끼의 후손만 가능
	private T animal;
	
	public RabbitFarm() {}
	
	public RabbitFarm(T animal) {
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
