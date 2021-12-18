package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculatorWhile{ 
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int no_of_workingdays =20;
public static final int max_working_Hours_in_Month =100;

	public static void main(String[] args) {
		int empHrs = 0, TotalempHrs =0 ,TotalWorkingDays =0;
		while( TotalempHrs<=max_working_Hours_in_Month && TotalWorkingDays < no_of_workingdays ) {
			TotalWorkingDays++;
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
		int TotalEmpWage=TotalempHrs *EMP_RATE_PER_HOUR;
		System.out.println("TotalEmpWage" +TotalEmpWage);
		
	}

}
