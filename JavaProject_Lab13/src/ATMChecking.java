import java.io.*;
public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String name,String pass,int money) {
		super(name,pass);
		this.money=money;
	}
	public boolean CheckBookBank() {
		return true;
	}
	public void show() {
		System.out.println("You drawing for "+this.money+", get");
		System.out.println("\t\t1000 = "+this.money%1000+"\n\t\t"+this.money%500+"\n\t\t"+this.money%100);
		System.out.println("Your balance is "+this.money+" Baht.");
	}
}
