package com.kkuk.ch09.part02;


public class MainClass {

	public static void operate(Calculator cal) {
		System.out.println("연산결과 : " + cal.add(10, 20));
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Greeting greeting = new Greeting(); // 인터페이스는 인스턴스 생성불가;

		// 인터페이스를 구현한 익명 객체 예제
		
		Greeting greeting = new Greeting() {
			
			@Override
			public void sayHi() {
				// TODO Auto-generated method stub
				System.out.println("하이 안녕 바이");
			}
		};
		
		greeting.sayHi();
		System.out.println("---------------------------");
		
		
		
		// 추상 클래스를 상속한 익명 객체 
		
		Animal animal = new Animal() {
			
			@Override
			void sound() {
				// TODO Auto-generated method stub
				System.out.println("멍멍");
			}
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("오도도도도도도돋ㄱ");
			}
		};
			
		animal.sound();
		animal.run();
		
		System.out.println("---------------------------");
		
		// 메서드의 매개변수로 익명 객체 전달
		
		operate(new Calculator() {
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b; // a와 b의 합을 반환하도록 오버라이딩
			}
		}); // Colculator로 만든 객체만 인수로 넣을수있음 -> 불가(인터페이스) -> 익명객체 사용
		
	}

}
