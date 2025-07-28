package com.kkuk.ch09.part01;

public class A {

	public A() {
		System.out.println("A객체가 생성됨");
		
	}

	// 인스턴스 멤버클래스 B
	public class B{

		public B() {
			System.out.println("B객체가 생성됨");	
		}
		
		int field1;
		public void method1() {
			
		}
	}
	
	// 정적 멤버 클래스 C
	public static class C {
		public C() {
			System.out.println("C객체가 생성됨");	
		}
		int field2;
		static int field3;
		public void method2() {
		
		}
		static void method3() {
			
		}
	}
	
	//로컬 클래스
	public void methodLocal() {
		class D{
			D() {
				System.out.println("D객체가 생성됨");	
			}
			int field1;
			void method1() {
				
			}
		}
		D d = new D();
		d.field1 = 30;
		d.method1();
		
	}
	
}
