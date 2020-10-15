package com.employeeWageforMultipleCompanies;

public class CompanyEmpWage {

	public final String company;
	public final double wagePerHour;
	public final int numberofWorkingDays;
	public final int maxHoursInMonth;
	public double totalWage;
	public int day;
	public CompanyEmpWage(String company, double wagePerHour, int numberofWorkingDays, int maxHoursInMonth) {

		this.company = company;
		this.wagePerHour = wagePerHour;
		this.numberofWorkingDays = numberofWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
		totalWage = 0;
	day = 0;
	}

	public void setTotalWage(double totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company : " + company + " is " + totalWage;
	}

}
