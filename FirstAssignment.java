package com.FirstAssignment;

public class FirstAssignment {
	public static void main(String[] args) {
		//int attendance;
		
		 final int sal = 20;
		 final int hours = 8;
		 final int part_time_hours = 4;
		System.out.println("Welcome");
		int attendance = (int)Math.floor(Math.random()*3); 
		System.out.println(attendance);
		if(attendance == 0) {
			System.out.println("Employee is absent");
		}
		else if (attendance == 2) {
			System.out.println("Employee is part time present");
			int total_salary = sal*part_time_hours;
			System.out.println(total_salary);
		}
		else {
			System.out.println("Employee is present");
			int total_salary = sal*hours;
					System.out.println(total_salary);
		}
		
		
	}

}
