package com.polymorphism;

public class A {

	void a(int a) {
		System.out.println("class A");
    }
	void n(float n) {
		System.out.println("duke");
	}
}
class B extends A{
	@Override
	void a(int a) {
		System.out.println("class B");
	}
	void n(float n) {
		System.out.println("rc");
	}
}
