
public class Date {
 private int dMonth;
 private int dDay;
 private int dYear;
 
 //Default constructor
 //PostCOndition : dMonth = 1, dDay = 1, dYear = 1900
 Date(){
	dMonth=1;
	dDay=1;
	dYear=1900;
	
 }
 //Constructor to set the date
 Date(int month ,int day, int year){
	 dMonth=month;
	 dDay=day;
	 dYear=year;
 }
 //Setter and Getter method
 public void setDate(int month ,int day, int year) {
	 dMonth=month;
	 dDay=day;
	 dYear=year;
 }
 public int getMonth() {
	 return dMonth;
 }
 public int dDay() {
	 return dDay;
 }
 public int getYear() {
	 return dYear;
 }
 public String toString() {
	 return dMonth+"-"+dDay+"-"+dYear;
 }
}
