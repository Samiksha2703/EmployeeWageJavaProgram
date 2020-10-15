package com.employeeWageforMultipleCompanies;

import java.util.Random;

public class UC9EmployeeWage {

	private final String company;
	private final double wagePerHour;
	private final int numberofWorkingDays;
	private final int maxHoursInMonth;
	private double totalWage;

	public UC9EmployeeWage(String company, double wagePerHour, int numberofWorkingDays, int maxHoursInMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.numberofWorkingDays = numberofWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public void totalwage() {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		Random rand = new Random();

		while (totalEmpHrs != maxHoursInMonth && totalWorkingDays != numberofWorkingDays) {

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

		System.out.println("Company :   " + company + "    total hours= " + totalEmpHrs + "    " + "total days= "
				+ totalWorkingDays);

		totalWage = totalEmpHrs * wagePerHour;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company : " + company + " is : " + totalWage;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		UC9EmployeeWage dMart = new UC9EmployeeWage("Dmart", 60, 28, 224);

		UC9EmployeeWage reliance = new UC9EmployeeWage("Relience", 80, 30, 240);

		dMart.totalwage();

		System.out.println(dMart);

		reliance.totalwage();

		System.out.println(reliance);
	}

}
