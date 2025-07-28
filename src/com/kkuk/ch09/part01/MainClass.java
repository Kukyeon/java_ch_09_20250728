package com.kkuk.ch09.part01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();  // A객체 생성
		
		A.B b = a.new B(); // b객체 생성
		b.field1 = 10;
		b.method1();
		
		
		A.C c = new A.C(); // 정적멤버라 a.new 불필요
		c.field2 = 100;
		c.method2(); 
		A.C.field3 = 50; // static 필드 접근
		A.C.method3();   // static 메소드 접근
		
		
		a.methodLocal(); // 로컬 클래스 객체 생성
		
	}

}
