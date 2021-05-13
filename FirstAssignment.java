package com.FirstAssignment;

public class FirstAssignment {
	public static void main(String[] args) {
		//int attendance;
		
		 final int sal = 20;
		 final int hours = 8;
		System.out.println("Welcome");
		int attendance = (int)Math.floor(Math.random()*2); 
		System.out.println(attendance);
		if(attendance == 0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
			int total_salary = sal*hours;
					System.out.println(total_salary);
		}
		
		
	}

}
