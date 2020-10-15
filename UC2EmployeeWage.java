package com.employeeWageforMultipleCompanies;

import java.util.Random;

public class UC2EmployeeWage {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation Program");

			int WAGE_PER_HR = 20;
			int FULL_DAY_HRS = 8;
			double daily_Wage;
			Random rand = new Random();
			int random = rand.nextInt(2);
			if (random == 1) {
				daily_Wage = WAGE_PER_HR * FULL_DAY_HRS;
				System.out.println("Employee-Present" + " " + "daily_Wage =" + daily_Wage);
			} else
				System.out.println("Employee-Absent" + " " + "Daily Wage = 0");
		}

	
}
