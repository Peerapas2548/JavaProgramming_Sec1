import java.util.*;
public class TestPiggyBank {
	static Piggy_bank pb =new Piggy_bank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

	/*pb.setPiggyBank(500);
	System.out.println("Money Total : "+pb.getTotal());
	pb.addTwo(34);
	System.out.println("Add 2 Baht Money : "+34);
	System.out.println("Money Total : "+pb.getTotal());
	pb.addTen(13);
	System.out.println("Add 10 Baht Money : "+13);
	System.out.println("Money Total : "+pb.getTotal());
	pb.addFive(100);*/
	inputCoin();
	}
public static void inputCoin() {
	System.out.println("Money Total : "+pb.getTotal());
	System.out.print("Please difine size of PiggyBank : ");
	int sizeofPiggyBank=scan.nextInt();
	pb.setPiggyBank(sizeofPiggyBank);
	System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
	MainMenu();
}
public static void Line() {
	System.out.println("==================================");
}
public static void MainMenu() {
	int number=0;
	while(true) {
		Line();
		System.out.println("Menu of PiggyBank");
		Line();
		System.out.print("[1] one baht."
				+ "\n[2] two baht."
				+ "\n[3] five baht."
				+ "\n[4] ten baht."
				+ "\n[5] Exit\n");
		Line();
		System.out.print("Please Select Menu[1-5] : ");
		int choice =scan.nextInt();
		if(choice==1) number=1;
		else if(choice==2) number=2;
		else if(choice==3) number=5;
		else if(choice==4) number=10;	
		else if(choice==5) {
			System.out.println("Bye Bye");
			break;
		}
		System.out.print("Insert "+number+" Baht Money : ");
		int totalofCoin = scan.nextInt();
		if(choice==1) {
			pb.addOne(totalofCoin);
		}
		else if(choice==2) {
			 pb.addTwo(totalofCoin);;
		}
		else if(choice==3) {
			 pb.addFive(totalofCoin);;
		}
		else if(choice==4) {
			 pb.addTen(totalofCoin);;
		}
		if(pb.getTotal()<=pb.getPiggyBank())
		System.out.println("Money Total : "+pb.getTotal());
		else {
			System.out.println("Piggy Bank Full ");
			System.out.println("Money Total : "+pb.getTotal());
		}
	}

}
}
