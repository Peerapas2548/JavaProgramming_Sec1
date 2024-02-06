import java.io.*;
import java.util.Scanner;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Header();
		Scanner read = new Scanner(new File("d://txtFile//student.txt"));
		int i=1;
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			double grade=read.nextDouble();
			read.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+fname.charAt(0)+"."+lname+"\t"+grade+"\t"+Status(grade));
			i++;
		}


	}
	public static String Level (String id) {
		if(id.startsWith("18")) return "4th";
		else if(id.startsWith("19")) return "3th";
		return "";
	}
	public  static String Status(double grade) {
		if(grade>2.00)return "Pass";
		else if(grade>=1.00&&grade<=2.00) return "Critical";
		else return "Retired";
	}
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("********************************************************************************************************************");
	}
}
