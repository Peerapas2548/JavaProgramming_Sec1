import java.text.*;//จัดรูปแบบเลข
import javax.swing.*;//input data from dialog box 

public class Example1 {
	public static void main(String[]args) {
		final int BUFFET = 299;
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		//รับข้อมูลทาง Dialog box และแปลงข้อมูลเป็นเลขจำนวนเต็ม
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		double discount,totalPrice=0;
		//calculate total price of buffet 
		totalPrice = BUFFET * numberofCustomer;
		//using Confirm Dialog box
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null, 
					"Total price is "+ frm.format(totalPrice) + " baht." + 
					"\nDo you have a member card?");
		}while(member==JOptionPane.CANCEL_OPTION);
		
		if(member == JOptionPane.YES_OPTION) {
			//discount = totalPrice - (totalPrice*10/100)
			  discount = totalPrice * 90/100;
			  JOptionPane.showMessageDialog(null, "Amount to be paid is "
			  		+ frm.format(discount) + " baht.");
		}//end of if
		
		else if ( member == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "Amount to be paid is "
					+ frm.format(totalPrice) +" baht.");
		}
	}

}
