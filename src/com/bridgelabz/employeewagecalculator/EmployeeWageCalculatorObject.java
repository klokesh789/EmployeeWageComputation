package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculatorObject {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String company;
	private final int EMP_RATE_PER_HOUR;
	private final int no_of_workingdays; 
	private final int max_working_Hours_in_Month;
	private int TotalEmpWage;
	
	public EmployeeWageCalculatorObject(String company , int EMP_RATE_PER_HOUR 
			, int no_of_workingdays , int max_working_Hours_in_Month) {
			this.company = company;
			this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR ;
			this.no_of_workingdays = no_of_workingdays;
			this.max_working_Hours_in_Month = max_working_Hours_in_Month;
			}
	public void EmployeeWageCalculation() {
		int empHrs = 0, TotalempHrs =0 ,TotalWorkingDays =0;	
		TotalWorkingDays++;
		while( TotalempHrs<=max_working_Hours_in_Month && TotalWorkingDays < no_of_workingdays ) {
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case 1:
				empHrs=8;
				break;
			case 2:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			TotalempHrs +=empHrs;
			System.out.println("TotalWorkingDays" +TotalWorkingDays + "EmpHrs" +empHrs);
		}
		TotalEmpWage =TotalempHrs *EMP_RATE_PER_HOUR;
	}
	public String toString() {
		return "Total Emp_Wage for company" +company+ "is:" +TotalEmpWage;
	}
	public static void main(String[] args) {
		EmployeeWageCalculatorObject Dmart = new EmployeeWageCalculatorObject("Dmart",20,20,100);
		EmployeeWageCalculatorObject RelianceMart = new EmployeeWageCalculatorObject("RelianceMart",20,15,80);
		Dmart.EmployeeWageCalculation();
		System.out.println(Dmart);
		RelianceMart.EmployeeWageCalculation();
		System.out.println(RelianceMart);
	}
}

