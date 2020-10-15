package com.employeeWageforMultipleCompanies;

import java.util.Random;

public class UC5EmployeeWage {

public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program");

	int WAGE_PER_HR = 20;
	int FULL_DAY_HRS = 8;
	int PART_TIME_HRS = 4;
	int NUM_OF_WORKING_DAYS = 20;
	double daily_Wage = 0;
	double monthly_Wage = 0;
	Random rand = new Random();
	for (int i = 0; i < NUM_OF_WORKING_DAYS; i++) {
		int random = rand.nextInt(3);
		switch (random) {
		case 1:
			daily_Wage = WAGE_PER_HR * FULL_DAY_HRS;
			break;
		case 2:
			daily_Wage = WAGE_PER_HR * PART_TIME_HRS;
			break;
		case 0:
			break;
		}
		monthly_Wage = monthly_Wage + daily_Wage;
	}
	System.out.println("Monthly Wage : " + monthly_Wage);
	
}

}
