import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee{
private String name;
private String dept;

public void insert()throws IOException {
	Scanner input = new Scanner(System.in);
	PrintStream writeFile =new PrintStream(new File("D:\\textFile\\employee.txt"));
	String answer;
	do {
		Header();
		System.out.print("Enter name : ");
		name =input.next();
		System.out.print("Enter department : ");
		dept=input.next();
		writeFile.println(name+"\t"+dept);
		System.out.print("Enter data again? : ");
		answer=input.next();
	}while(answer.equalsIgnoreCase("y"));

	writeFile.close();
	
}
public void read() {
	try {
		Scanner readFile = new Scanner(new File("D:\\textFile\\employee.txt"));
		boolean check =false;
		Header();
		int i =0;
		while(readFile.hasNext()) {
			name=readFile.next();
			dept=readFile.next();
			if(dept.equalsIgnoreCase(super.getDept())) {
				System.out.println(i+1+") "+name);
				check=true;
			}
			if(check==false) {
				Header();
				System.out.print("\nSorry,no department : "+super.getDept()+" in file.");
			}
			i++;
		}
		Header();
		System.out.print("\nEmployee in dept "+super.getDept()+" is "+i+" person.");
	}catch(IOException e){
		System.out.println("Sorry, File not found...");
	}
}
}
