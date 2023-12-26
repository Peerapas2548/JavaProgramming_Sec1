import java.util.*;
public final class lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums= {78,36,58,41,25,92,75};
		int indexOfNum;
		System.out.print("Input index of array : ");
		indexOfNum=scan.nextInt();
		while(indexOfNum<0||indexOfNum>6) {
			System.out.print("Input index of array, again : ");
			indexOfNum=scan.nextInt();
		}
		System.out.println("");
		if(indexOfNum!=6) {
		System.out.print("Value in current index is "+nums[indexOfNum]+
						 "\nValue in next    index is "+nums[indexOfNum+1]);
		}
		else{
			System.out.print("Value in current index is "+nums[indexOfNum]+
					 "\nSorry, 6 is the last index in array.");
		}
		
	}

}
