import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
			DecimalFormat frm = new DecimalFormat("###.0");
			//input and convert weight and height from string to double
			double weight = Double.parseDouble(
					JOptionPane.showInputDialog("Input Weight : "));
			double height = Double.parseDouble(
					JOptionPane.showInputDialog("Input Height :"));
			//convert height from cm to m
			height = height/100;
			//calculate BMI
			double bmi = weight/(height*height);
			String bmiCategory;
			//display BMI from dialog box
			if(bmi <18.5 )  bmiCategory = "Underweight!";
			else if(bmi<25) bmiCategory = "Normal-weight";
			else if(bmi<30) bmiCategory = "Overweight!!";
			else bmiCategory = "Obesity!!!";
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)
			+"\nYou are "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
			
	}

}
