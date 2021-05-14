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
		switch(attendance)
		{
		case 0:
			System.out.println("Employee is absent");
			break;
		case 1:
			System.out.println("Employee is part time present");
			int part_time_salary = sal*part_time_hours;
			System.out.println(part_time_salary);
		break;
		case 2:
			System.out.println("Employee is full time present");
			int total_salary = sal*hours;
			System.out.println(total_salary);
			int no_of_days=20;
			int total_monthly_sal=no_of_days*total_salary;
			System.out.println(total_monthly_sal);
		break;
		
		default:
		System.out.println("Invalid output");
		break;
		
		
		
	}

}
}