
public class ProblemStatement_1 {
	// Declaration of instance variables
			private int day,month,year;
	
	//  declared getters and setters in class		
			public int getDay() {
				return day;
			}

			public void setDay(int day) {
				this.day = day;
			}

			public int getMonth() {
				return month;
			}

			public void setMonth(int month) {
				this.month = month;
			}

			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}
	
	
		// main function to get and set and print valsues	
			public static void main(String[] args) {
				
		// creation of object
				ProblemStatement_1 date = new ProblemStatement_1();
				
				date.setDay(01);;
				date.setMonth(02);
				date.setYear(2012);
				

				System.out.println("Date is " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
			}
}
