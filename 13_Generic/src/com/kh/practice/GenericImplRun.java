package com.kh.practice;

interface Inter1<T> {
	void method1(T data);
}

interface Inter2<F> {
	void method2(F data);
}

class DataClass04<E> implements Inter1<E>, Inter2<E> {


	@Override
	public void method1(E data) {
		System.out.println(data);
		
	}
	
	@Override
	public void method2(E data) {
		System.out.println(data);
		
	}
	
	// void method1(E data);
	// void method2(E data);
	
}

public class GenericImplRun {
	
	public static void main(String[] args) {
		
		//DataClass04 객체를 생성해서, "좋아하는 색은", "xxx다"
		
		DataClass04<String> dat1 = new DataClass04<>();
		dat1.method1("좋아하는 색은");
		dat1.method2("xxx다");
		
		DataClass04<Integer> adat1 = new DataClass04<>();
		adat1.method1(100000);
		adat1.method2(121212);
		
	}

}
