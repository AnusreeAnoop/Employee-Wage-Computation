class EmpWageBuilder {

	public static void main(String[] args) {

		System.out.println(" Welcome To Employee Wage Computation Program ");

		int empHour=0;
		int empRatePerHour=20;
		int empSalary=0;
		final int partTime=0;
		final int fullTime=1;
		
		double empPresent = Math.floor(Math.random() * 10) % 3;
		switch ((int)empPresent) {

			case partTime:
					System.out.println("Employee is part time Present");
					empHour=4;
					break; 
			case fullTime:
					System.out.println("Employee is full time Present");
					empHour=8;
					break;
			default:
					empHour=0;
					System.out.println("Employee is Absent");
					break;

		}

		empSalary=empRatePerHour*empHour;
		System.out.println("Salary is :" +empSalary);
	}
}
