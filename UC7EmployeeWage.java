package com.employeeWageforMultipleCompanies;

import java.util.Random;
import java.util.Scanner;

public class UC7EmployeeWage {

	static int WAGE_PER_HR = 20;
	static int FULL_DAY_HRS = 8;
	static int PART_TIME_HRS = 4;
	static int NUM_OF_WORKING_DAYS = 20;
	static int MAX_HRS_IN_MONTH = 100;

	static int totalEmpHrs = 0;
	static int empHrs = 0;
	static int totalWorkingDays = 0;
	static double monthly_Wage = 0;
	static double daily_Wage = 0;

	static void attendance() {

		Random rand = new Random();

		int random = rand.nextInt(2);

		if (random == 1)
			System.out.println("Present");
		else
			System.out.println("Absent");
	}

	static void dailywage() {

		Random rand = new Random();

		int random = rand.nextInt(2);

		if (random == 1) {
			daily_Wage = WAGE_PER_HR * FULL_DAY_HRS;
			System.out.println("Present " + "FullDay " + "DailyWage = " + daily_Wage);
		} else
			System.out.println("Absent " + "Daily Wage = 0");
	}

	static void dailywagewithPT() {

		Random rand = new Random();

		int random = rand.nextInt(3);

		if (random == 1) {
			daily_Wage = WAGE_PER_HR * FULL_DAY_HRS;
			System.out.println("Present " + "FullDay " + "Daily_Wage = " + daily_Wage);
		} else if (random == 2) {
			daily_Wage = WAGE_PER_HR * PART_TIME_HRS;
			System.out.println("Present " + "PartTime " + "DailyWage = " + daily_Wage);
		} else
			System.out.println("Absent " + "Daily Wage = 0");
	}

	static void dailywagewithswitchcase() {

		Random rand = new Random();

		int random = rand.nextInt(3);

		switch (random) {

		case 1:
			daily_Wage = WAGE_PER_HR * FULL_DAY_HRS;
			System.out.println("Present " + "DailyWage = " + daily_Wage);
			break;

		case 2:
			daily_Wage = WAGE_PER_HR * PART_TIME_HRS;
			System.out.println("Present " + "DailyWage = " + daily_Wage);
			break;

		case 0:
			System.out.println("Absent " + "Daily Wage = 0");
			break;

		}

	}

	static void monthlywage() {

		Random rand = new Random();

		for (int i = 0; i < NUM_OF_WORKING_DAYS; i++) {

			int random = rand.nextInt(3);

			switch (random) {

			case 1:
				daily_Wage = WAGE_PER_HR * FULL_DAY_HRS;
				System.out.println("Present " + "FullTime " + "DailyWage " + daily_Wage);
				break;

			case 2:
				daily_Wage = WAGE_PER_HR * PART_TIME_HRS;
				System.out.println("Present " + "PartTime " + "DailyWage " + daily_Wage);
				break;

			case 0:
				daily_Wage = 0;
				System.out.println("Absent " + "DailyWage " + daily_Wage);
				break;

			}

			monthly_Wage = monthly_Wage + daily_Wage;

		}

		System.out.println("Monthly Wage : " + monthly_Wage);

	}

	static void monthlywagewithcondition() {

		Random rand = new Random();

		while (totalEmpHrs != MAX_HRS_IN_MONTH && totalWorkingDays != NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;

			int random = rand.nextInt(3);

			switch (random) {

			case 1:
				empHrs = FULL_DAY_HRS;
				System.out.println("Present " + "FullDay " + "Working Hours " + empHrs);
				break;

			case 2:
				empHrs = PART_TIME_HRS;
				System.out.println("Present " + "PartTime " + "Working Hours " + empHrs);
				break;

			case 0:
				empHrs = 0;
				System.out.println("Absent " + "empHrs");
				break;

			}

			totalEmpHrs = totalEmpHrs + empHrs;

		}

		monthly_Wage = totalEmpHrs * WAGE_PER_HR;

		System.out.println("Monthly Wage : " + monthly_Wage);

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		System.out.println(
				"Enter the choice 1-attendance 2-dailywage 3-dailywagewithPT 4-dailywagewithswitchcase 5-monthlywage 6-monthlywagewithcondition");

		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();

		switch (input) {

		case 1:
			attendance();
			break;

		case 2:
			dailywage();
			break;

		case 3:
			dailywagewithPT();
			break;

		case 4:
			dailywagewithswitchcase();
			break;

		case 5:
			monthlywage();
			break;

		case 6:
			monthlywagewithcondition();
			break;

		}

		scanner.close();

	}

}

	

