import java.util.*;
public class FictionDemo1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Book title : ");
		String title = scan.nextLine();
		System.out.print("Input year : ");
		int year = scan.nextInt();
		FictionBook book = new FictionBook(title,year);
		System.out.print("Input your name : ");
		String name =scan.nextLine();
		System.out.print("Input your email : ");
		String email = scan.nextLine();
		book.setAuthorName(name);
		book.setEmail(email);
		while(!book.checkFormatName()||!book.checkEmail()) {
			System.out.print("Input your name : \n");
			name =scan.nextLine();
			System.out.print("Input your email : ");
			email = scan.nextLine();
			book.setAuthorName(name);
			book.setEmail(email);
		}
			System.out.println(book);
		
	
	}
}
