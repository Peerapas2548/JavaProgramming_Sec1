import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[]args) {
		//Input AllData
		/*double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput= Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		//send 3 argument to constructor 
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		//Show the width length and color
		JOptionPane.showMessageDialog(null, obj1.toString()+"\nArea of Rectangle = "+obj1.getArea());*/
		
		//Input data using interface 
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput= Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane .showMessageDialog(null, obj2.toString()+"\nArea of Rectangle = "+obj2.getArea());
		
	}
	
}
