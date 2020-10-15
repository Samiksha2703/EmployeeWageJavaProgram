package com.employeeWageforMultipleCompanies;

import java.util.Random;

public class UC8EmployeeWage {

	public static void totalwage(String company, double wagePerHour, int numberofWorkingDays, int maxHoursInMonth) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		Random rand = new Random();

		while (totalEmpHrs <= maxHoursInMonth && totalWorkingDays < numberofWorkingDays) {
			totalWorkingDays++;

			int random = rand.nextInt(3);

			switch (random) {

			case 1:
				empHrs = 8;
				break;

			case 2:
				empHrs = 4;
				break;

			case 0:
				empHrs = 0;
				break;

			}

			totalEmpHrs = totalEmpHrs + empHrs;
			
		}

		double totalWage  = totalEmpHrs * wagePerHour;
		System.out.println("Company :   "+company+"    total hours= "+totalEmpHrs+"    "+"total days= "+totalWorkingDays);
		System.out.println("Company:   "+company+"   Total Wage : " + totalWage);

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		UC8EmployeeWage.totalwage("Dmart", 60, 28, 224);
		UC8EmployeeWage.totalwage("Relience", 80, 30, 240);

	}

}

