package com.FirstAssignment;

public class UseCase6 {
	public static void main(String[] args) {
		 int hours = 0;
		 int days = 0;
		 int wage = 20;
		 int total_salary;
		while (hours <= 100 && days <= 20)
		{
			total_salary = wage*hours*days;
			System.out.println(total_salary);
			hours++;
			days++;
		}
	}

}
