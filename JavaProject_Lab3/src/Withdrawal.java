import java.util.Random;
import java.text.*;
import javax.swing.*;
public class Withdrawal {

	public static void main(String[] args) {
			DecimalFormat frm = new DecimalFormat("#,###.00");
			Random rand = new Random();
			int balance = rand.nextInt(9) * 100000;
			
			int withdrawMoney = Integer.parseInt(
					JOptionPane.showInputDialog("Your balnce : "+frm.format(balance)
					+"\nInput money to withdraw : "));
			if(balance<withdrawMoney) {
				JOptionPane.showMessageDialog(null, 
						"Error : Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			else if (withdrawMoney>20000) {
				JOptionPane.showMessageDialog(null, 
						"Error : Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			else if (withdrawMoney%100 != 0) {
				int money = withdrawMoney%100;
				JOptionPane.showMessageDialog(null, 
						"Error : Canonot withdraw "+ money + " baht.");
			}
			else {
				int thousand,fhundred,hundred;
				thousand = withdrawMoney / 1000;
				fhundred = withdrawMoney % 1000 / 500;
				hundred  = withdrawMoney % 1000 % 500 / 100;
				JOptionPane.showMessageDialog(null, 
						"You withdraw "+withdrawMoney+" baht."
						+ "\n1000 = " + thousand +"\n500 = "+fhundred+"\n100 = "+hundred);
			}
			}

	}



