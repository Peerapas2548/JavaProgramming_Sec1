import java.util.*;
public class Lab604 {
	static Scanner input = new Scanner(System.in);
	static String studentId,subId;
	static int subjectId;
	static boolean stdIT,subIT;
	
	public static void main(String[] args) {
		inputStudent();

	}//end of main
public static void inputStudent() {
	do {
		System.out.print("Enter Student Id : ");
		studentId=input.next();
		System.out.print("Enter Subject Id : ");
		subjectId=input.nextInt();
		subId = subjectId+"";//convert subjectId from integer to String
	}while(!isLength(studentId,subId));
	System.out.println();
	displayData(isITStudent(studentId),isITSubject(subId));
	}//end of inputStudent()
public static boolean isLength(String sid,String subId) {
	if(sid.length()==10&&subId.length()==7) {
		return true;
	}
	else return false;
	
	}//end of isLength()
public static boolean isITStudent(String sid) {
	if(sid.substring(0,2).equals("23")&&sid.substring(2,3).equals("1")&&sid.substring(3,6).equals("311")) {
		return true;
	}
	else return false;
	
	}//end of isITStudent()
public static boolean isITSubject(String subId) {
	if(subId.substring(0,2).equals("21")&&subId.substring(4,5).equals("1")) {
		return true;
	}
	
	else return false;
	
	}//end of isITSubject()
public static void displayData(boolean stdIT,boolean subIT) {
	if(stdIT==true) {
		System.out.println("Student Id : "+studentId+" 1st year student in IT");
	}
	else System.out.println("Student Id : "+studentId+" is not 1st year student in IT");
	//System.out.println("Student Id : "stdIT==true?+studentId+" 1st year student in IT":+studentId+" is not 1st year student in IT");
	if(subIT==true) {
		System.out.println("Enroll in course for Year 1");
	}
	else System.out.println("not enroll in course for Year 1");
	//System.out.println(subIT==true?"Enroll in course for Year 1":"not enroll in course for Year 1");
		
	}//end of displayData()
}
