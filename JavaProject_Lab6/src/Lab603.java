import java.util.*;
public class Lab603 {
static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by a space\n: ");
		String inputfullName = input.next();
		abbreviaName(inputfullName);
		System.out.println(abbreviaName(inputfullName));
	}
public static String abbreviaName (String fullName) {
	String firstName = fullName.substring(0,fullName.indexOf(' '));
	String midName = fullName.substring(fullName.indexOf(' ')+1,fullName.indexOf(' ')+2);
	String lastName = fullName.substring(fullName.indexOf(' ')+1,fullName.lastIndexOf(' ')+2);
	return midName+"."+lastName+"."+firstName;
	}
}
