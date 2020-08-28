class EmpWageBuilder
{

	final int empRatePerHour=20;
	final int partTime=0;
	final int fullTime=1;
	int workingDays;
	int totalEmpSalary=0;
	int empSalary=0;
	int workingHours;
	String companyName;


	EmpWageBuilder(String companyName, int workingHours, int workingDays) {
		this.companyName=companyName;
		this.workingHours=workingHours;
		this.workingDays=workingDays;
		System.out.println();
		System.out.println("Company name="+companyName);
	}
	
	void computeWage() {
		int empHour=0;
		int totalEmpHours=0;
		int totalWorkingDays=0;

		while(totalEmpHours<workingHours && totalWorkingDays<workingDays){
			totalWorkingDays++;
			double empPresent = Math.floor(Math.random() * 10) % 3;
			switch ((int)empPresent) {

				case partTime:
					System.out.println("Day:"+totalWorkingDays+"; Employee is part time Present; Employee hours:"+totalEmpHours);
					empHour=4;
					break; 
				case fullTime:
					System.out.println("Day:"+totalWorkingDays+"; Employee is full time Present; Employee hours:"+totalEmpHours);
					empHour=8;
					break;
				default:
					empHour=0;
					System.out.println("Day:"+totalWorkingDays+"; Employee is Absent");
					break;
			
			}
			totalEmpHours+=empHour;
			empSalary=empRatePerHour*empHour;
			totalEmpSalary+=empSalary;
		}

		System.out.println("Total hours="+totalEmpHours+"; Total Worked days="+totalWorkingDays);
		System.out.println("Salary is :" +totalEmpSalary);

	}

	public static void main(String[] args) {
		System.out.println(" Welcome To Employee Wage Computation Program ");
		EmpWageBuilder Reliance = new EmpWageBuilder("Reliance",150,25);
		EmpWageBuilder Tata = new EmpWageBuilder("Tata",200,30);
		Reliance.computeWage();
		System.out.println(Reliance);
		Tata.computeWage();
		System.out.println(Tata);

	}

}
