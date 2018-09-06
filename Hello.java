package com.gm.abspractice;

public class Hello  extends Test{

	
	@Override
	public void demo() {
		
		System.out.println(" this is overridden demo method");
		
	}

	@Override
	public void happy() {

		System.out.println("this is overridden happy method");
	}
	
	public static void main(String[] args) {
		
		
		Hello h=new Hello();
		
		h.demo();
		h.happy();
	}
	
	

}
