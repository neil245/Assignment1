package com.FirstAssignment;

public class FirstAssignment {
	public static void main(String[] args) {
		//int attendance;
		System.out.println("Welcome");
		int attendance = (int)Math.floor(Math.random()*2); 
		System.out.println(attendance);
		if(attendance == 0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
		}
	}

}
