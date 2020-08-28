class EmpWageBuilder
{

	final int empRatePerHour=20;
	final int partTime=0;
	final int fullTime=1;
	final int workingDays=20;
	int empHour=0;
	int empSalary=0;
	int totalEmpSalary=0;
	int totalEmpHours=0;
	int workingHours;
	int totalWorkingDays;
	String companyName;


	void ComputeWage(String name, int hours, int days) {
		String companyName=name;
		int workingHours=hours;
		int workingDays=days;

		while(totalEmpHours<workingHours && totalWorkingDays<workingDays){
			totalWorkingDays++;
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
			totalEmpHours+=empHour;
			empSalary=empRatePerHour*empHour;
			totalEmpSalary+=empSalary;
		}

		System.out.println("Company name="+name);
		System.out.println("Total hours="+totalEmpHours+"; Total Worked days="+totalWorkingDays);
		System.out.println("Salary is :" +totalEmpSalary);

	}
	public static void main(String[] args) {
		System.out.println(" Welcome To Employee Wage Computation Program ");
		EmpWageBuilder wage = new EmpWageBuilder();
		wage.ComputeWage("Reliance",150,25);

		wage.ComputeWage("Tata",200,30);
	}
}
