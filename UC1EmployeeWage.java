package com.employeeWageforMultipleCompanies;

import java.util.Random;

public class UC1EmployeeWage {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation Program");
			Random rand = new Random();
			int random = rand.nextInt(2);
			if (random == 1)
				System.out.println("Employee-Absent");
			else
				System.out.println("Employee-Present");
		}
	
}
	
