	//i had given the class name to this but actual it should be employees
	public class ProblemStatement_3 {
		private int empId;
		private String name;
		private Double basicSalary, HRA, Medical, PF, PT, netSalary, grossSalary;
		
		// Default Constructor
		public ProblemStatement_3() {
			
			empId = 101;
			name = "mahesh";
			basicSalary = 10000.00;
			System.out.println("Id : "+empId+"\nName: " +name+" \nBasic Salary: "+basicSalary);
		}
		
		
		//Parameterize Constructor
		public ProblemStatement_3(int id, String ename, Double sal) {
				
				empId = id;
				name = ename;
				basicSalary = sal;
				System.out.println("Id : "+empId+"\nName: " +name+" \nBasic Salary: "+basicSalary);
			}
			
		//Method to display other variables
		public void display() {
			HRA = basicSalary/100*50;
			PF = basicSalary/100*12;
			PT = 200.00;
			grossSalary = basicSalary + HRA ;
			netSalary = grossSalary - (PT + PF);
			
			System.out.println("HRA: " + HRA + "\nPF: " + PF + "\nPT: " + PT + "\nNet Salary: "+ netSalary + "\nGross Salary: " + grossSalary );
			
			
		}
		
		//Main Method to call constructor
		public static void main(String[] args) {
			
			// Calling Default Constructor
			ProblemStatement_3 data = new ProblemStatement_3();
			data.display();
			
			System.out.println("\n---------------------------------------\n");
			
			// Calling Parameterize Constructor
			ProblemStatement_3 data2 = new ProblemStatement_3(102,"shubham",15000.00);
			data.display();
		}
	}
