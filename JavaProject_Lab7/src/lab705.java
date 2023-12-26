import javax.swing.*;
public final class lab705 {

	public static void main(String[] args) {
		int[] nums =new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));
		}
		showEven(nums);
		showOdd(nums);
	}
public static void showEven(int[] number) {
	String display="";
	for(int _nums:number) 
		if(_nums%2==0) 
			display+=_nums+" ";		
	JOptionPane.showMessageDialog(null, "List of even number :\n"+display);
		
	
}
public static void showOdd(int[] number) {
	String display="";
	for(int _nums:number) 
		if(_nums%2!=0) 
			display+=_nums+" ";
		JOptionPane.showMessageDialog(null, "List of odd number :\n"+display);
	
	}
}
