package com.employeeWageforMultipleCompanies;

import java.util.Random;

public class UC6EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int WAGE_PER_HR = 20;
		int FULL_DAY_HRS = 8;
		int PART_TIME_HRS = 4;
		int NUM_OF_WORKING_DAYS = 20;
		int MAX_HRS_IN_MONTH = 100;

		int totalEmpHrs = 0;
		int empHrs = 0;
		int totalWorkingDays = 0;
		double monthly_Wage = 0;

		Random rand = new Random();

		while (totalEmpHrs != MAX_HRS_IN_MONTH && totalWorkingDays != NUM_OF_WORKING_DAYS) {

			totalWorkingDays++;

			int random = rand.nextInt(3);

			switch (random) {

			case 1:
				empHrs = FULL_DAY_HRS;
				break;

			case 2:
				empHrs = PART_TIME_HRS;
				break;

			case 0:
				empHrs = 0;
				break;
			}
			
			totalEmpHrs = totalEmpHrs + empHrs;
		
		}
		
		monthly_Wage = totalEmpHrs * WAGE_PER_HR;
		
		System.out.println("Monthly Wage : " + monthly_Wage);

	}

	
}
