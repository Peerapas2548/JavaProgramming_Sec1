import javax.swing.*;
public final class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
public static void inputEmail() {
	String inputEmail = JOptionPane.showInputDialog("Input your e-mail : ").toLowerCase();
	while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) {
		inputEmail = JOptionPane.showInputDialog("Input your e-mail, again : ");
	}
	/*boolean validateEmail = checkEmail(inputEmail);
	if(validateEmail==true) {
		JOptionPane.showMessageDialog(null,"Your e-mail is "+ inputEmail.toLowerCase());
	}
	else {
		JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail dot com or gmail dot com");
	}*/
	while(checkEmail(inputEmail)==false) {
		 inputEmail = JOptionPane.showInputDialog("Input your e-mail, again : ");
	}
	JOptionPane.showMessageDialog(null,"Your e-mail is "+ inputEmail);
}
public static boolean checkEmail(String email) {
	if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")){
		return true;
	} 
	else {
	return false;
	}
}
}
