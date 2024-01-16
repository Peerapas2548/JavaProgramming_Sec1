import java.util.Scanner;
public class AuthorDemo2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String name,email;
		for(int i=1;i<=4;i++) {
			System.out.print("Information Author "+i);
			System.out.print("Input author name : ");
			name=scan.nextLine();
			System.out.print("Input author e-mail : ");
			email=scan.nextLine();
			Author a1=new Author(name,email);
			System.out.println();
			System.out.println(a1);
		}

	}

}
