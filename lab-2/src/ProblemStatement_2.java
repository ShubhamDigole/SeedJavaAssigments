
public class ProblemStatement_2 {

	// Declaration of instance variables
	private int day,month,year;
	 
	//default constructor
	public ProblemStatement_2() {
		
		day = 02;
		month = 03;
		year = 2014;
		System.out.println("Date is: " +day +"/" + month+"/"+year);
		
	}
	
	// parameterize constructor 
	public ProblemStatement_2(int d, int m, int y) {
			
			day = d;
			month = m;
			year = y;
			System.out.println("Date is: " +day +"/" + month+"/"+year);

		}
	
	// main method to display class
	public static void main(String[] args) {
		
		//first statement will call default constructor
		ProblemStatement_2 date = new ProblemStatement_2();
		
		//first statement will call parameterize constructor
		ProblemStatement_2 date2 = new ProblemStatement_2(01,02,1001);
		
		
	}
	}
