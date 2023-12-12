import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Full name : ");
		String fullName = scan.nextLine();
		String firstName,lastName;
		int space = fullName.indexOf(" ");
		if(space == -1) {
			System.out.println("Incorrect Name");
		}
		else {
			firstName = fullName.substring(0,space);
			lastName = fullName.substring(space+1);
			System.out.println("First name : "+firstName.toUpperCase());
			System.out.println("Last name : "+lastName.toLowerCase());
		}

	}

}
