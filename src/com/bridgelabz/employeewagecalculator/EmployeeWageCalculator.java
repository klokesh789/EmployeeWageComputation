package com.bridgelabz.employeewagecalculator;


public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int no_of_workingdays =20;
	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		int empMonthlywage = 0;
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		for ( int day =0 ;day<=no_of_workingdays;day++) {
			switch( empCheck ) {
			case 2: 			
				System.out.println("Employee is present ");
				empHrs = 8;
				break;
			case 1 :
				System.out.println("Employee doing part-time ");
				empHrs = 8;
				break;
			default:
				System.out.println("Employee is Absent ");
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			empMonthlywage = empWage * no_of_workingdays;
			System.out.println("Emp Wage: " + empWage);
		}
		System.out.println("Total Monthly Wage: " +empMonthlywage);

	}

}
