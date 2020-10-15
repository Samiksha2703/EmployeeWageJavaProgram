package com.employeeWageforMultipleCompanies;

import java.util.Random;

public class UC11EmployeeWage implements InterfaceEmployeeWage {

	private int numOfCompany = 0;
	
	private CompanyEmpWage[] companyEmpWageArray;

	public UC11EmployeeWage() {
		
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	
	@Override
	public void addCompanyEmpWage(String company, double wagePerHour, int numberofWorkingDays, int maxHoursInMonth)

	{

		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, wagePerHour, numberofWorkingDays, maxHoursInMonth);

		numOfCompany++;

	}

	
	@Override
	public void computeEmpWage() {
		
		for (int i = 0; i < numOfCompany; i++) {
		
			companyEmpWageArray[i].setTotalWage(this.totalwage(companyEmpWageArray[i]));
			
			System.out.println(companyEmpWageArray[i]);
		
		}
	
	}
	
	
	public double totalwage(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		Random rand = new Random();

		while (totalEmpHrs != companyEmpWage.maxHoursInMonth && totalWorkingDays != companyEmpWage.numberofWorkingDays) {

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

		System.out.println("total hours= " + totalEmpHrs + "    " + "total days= "+ totalWorkingDays);

		return totalEmpHrs * companyEmpWage.wagePerHour;
	}


public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation Program");

	UC11EmployeeWage manageEmployeeWage = new UC11EmployeeWage ();
	
	manageEmployeeWage.addCompanyEmpWage("Dmart", 60, 28, 224);

	manageEmployeeWage.addCompanyEmpWage("Relience", 80, 30, 240);

	manageEmployeeWage.computeEmpWage();
}


}

