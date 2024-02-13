import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		//create object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		
		
		// create object for write data to file use PrintWriter Class
		//FileWriter filename = new FileWriter("D:\\textFile\\product.txt",true);
		//PrintWriter writeFile =new PrintWriter(filename);
		PrintWriter writeFile =new PrintWriter(new FileWriter("D:\\textFile\\product.txt",true));
		
		System.out.print("Product Id : ");
		String productId = input.next();
		System.out.print("Product Name : ");
		String productName=input.next();
		System.out.print("Product Unit : ");
		int productUnit = input.nextInt();
		System.out.print("Product Unit : ");
		float productPrice = input.nextFloat();
		
		
		//insert(save)all data to file(after the previous data)
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("Write file away...");
		writeFile.close();

	}

}
