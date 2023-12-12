import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.input sentence
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		//2.check .
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		//3.loop for check space
		int space =0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				space+=1;
			}
			
		}
		System.out.println("This sentence has "+ space + " spacebar.");
		System.out.println("This sentence has "+ (space+1) + " word.");
	}

}
