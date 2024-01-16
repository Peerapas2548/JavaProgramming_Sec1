import java.util.Scanner;
public class BookDemo {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book b1=new Book();
		System.out.print("Input book title   : ");
		b1.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		b1.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		b1.setPublishyear(scan.nextInt());		
		System.out.println();
		System.out.println(b1);
	}

}
