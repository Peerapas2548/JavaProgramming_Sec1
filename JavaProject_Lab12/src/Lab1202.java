import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner input =new Scanner(System.in);
		System.out.print("Input your email : ");
		String email=input.next();
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//MemberLogin.txt"));
		String tmp ="";
		while((tmp=readFile.readLine())!=null){
			String[] data = tmp.split("\t");
		String password =data[2];
		String mail = data[3];
		if(email.equalsIgnoreCase(mail)) {
			System.out.println("Your password is "+password);
		}
		
	}
		else 
			System.out.println("The data is not found...");
	readFile.close();
}
}