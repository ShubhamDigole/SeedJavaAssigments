
public class MyDate {
	
		// Declaration of instance variables
		private int day,month,year;
	 
		
		//method for getting date from user
	 	public void initDate(int d,int m,int y) {
 		
 		day = d;
 		month = m;
 		year = y;
 		
 		}
	 	
	 	//method for displaying the date
 		public void displayDate() {
			
 			System.out.println("The Date Is " +day+"/" + month+"/" + year);
		}
 		
 		//main function returns the date
 		public static void main(String[] args) {
			MyDate d = new MyDate();
			
			d.initDate(01, 02, 1996);
			d.displayDate();
					
 			
		}
 		
}
