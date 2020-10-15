package com.employeeWageforMultipleCompanies;

import java.util.ArrayList;
import java.util.Random;

public class UC12EmployeeWage {

	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;

	public UC12EmployeeWage() {

		companyEmpWageArrayList = new ArrayList<>();
	}

	public void addCompanyEmpWage(String company, double wagePerHour, int numberofWorkingDays, int maxHoursInMonth)

	{
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHour, numberofWorkingDays, maxHoursInMonth);

		companyEmpWageArrayList.add(companyEmpWage);
	}

	public void computeEmpWage() {

		for (int i = 0; i < companyEmpWageArrayList.size(); i++) {

			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);

			companyEmpWage.setTotalWage(this.totalwage(companyEmpWage));

			System.out.println(companyEmpWage);
		}
	}

	private double totalwage(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		Random rand = new Random();

		while (totalEmpHrs != companyEmpWage.maxHoursInMonth
				&& totalWorkingDays != companyEmpWage.numberofWorkingDays) {

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

		System.out.println("total hours= " + totalEmpHrs + "    " + "total days= " + totalWorkingDays);

		return totalEmpHrs * companyEmpWage.wagePerHour;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		UC12EmployeeWage uc12EmployeeWage = new UC12EmployeeWage();

		uc12EmployeeWage.addCompanyEmpWage("Dmart", 60, 28, 224);

		uc12EmployeeWage.addCompanyEmpWage("Relience", 80, 30, 240);

		uc12EmployeeWage.computeEmpWage();
	}
}
