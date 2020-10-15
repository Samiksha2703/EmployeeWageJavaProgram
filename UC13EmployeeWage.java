package com.employeeWageforMultipleCompanies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class UC13EmployeeWage {

	private HashMap<Integer, Double> companyEmpWageHashMap;

	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;

	public UC13EmployeeWage() {

		companyEmpWageHashMap = new HashMap<>();
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

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, day;
		double dailyWage = 0;

		Random rand = new Random();

		while (totalEmpHrs != companyEmpWage.maxHoursInMonth
				&& totalWorkingDays != companyEmpWage.numberofWorkingDays) {

			totalWorkingDays++;

			day = totalWorkingDays;

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

			dailyWage = empHrs * companyEmpWage.wagePerHour;

			totalEmpHrs = totalEmpHrs + empHrs;

			companyEmpWageHashMap.put(day, dailyWage);
		}

		for (int j = 1; j <= companyEmpWageHashMap.size(); j++) {

			System.out.println("Day " + j + " - " + companyEmpWageHashMap.get(j));
		}

		// System.out.println(companyEmpWageHashMap);

		System.out.println("total hours= " + totalEmpHrs + "    " + "total days= " + totalWorkingDays);

		return totalEmpHrs * companyEmpWage.wagePerHour;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		UC13EmployeeWage uc13EmployeeWage = new UC13EmployeeWage();

		uc13EmployeeWage.addCompanyEmpWage("Dmart", 60, 28, 224);

		uc13EmployeeWage.addCompanyEmpWage("Relience", 80, 30, 240);

		uc13EmployeeWage.computeEmpWage();
	}

}
