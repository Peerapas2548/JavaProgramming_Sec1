
public class Example1 {

	public static void main(String[] args) {
			String isbn="IB2-6325-85-4-1", title="Basic Java Programming";
			int unit=5;
			//float price = 225.75f;
			double price = 225.75;
			System.out.println("Book ISBN  : "+isbn);
			System.out.println("Book Title : "+title);
			System.out.println("Book Unit  : "+unit);
			System.out.println("Book Price : "+price);
			System.out.println("---------------------------------");
			double totalprice = unit*price;
			System.out.println("Total price is "+totalprice);
			double vat = totalprice+(totalprice*7/100);//calculate vat in Baht
			System.out.println("Add VAT 7%  is "+vat);
			
	}

}
