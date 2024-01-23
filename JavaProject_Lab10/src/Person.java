public class Person {
	private String firstName;
	private String lastName;
	//Default Constructor
	//Initialize firstName and lastName to an empty string
	Person(){
		firstName=lastName="";
	}
	//Constructor with parameter
	Person(String first, String last){
		//firstName = first;
		//lastName = last;
		setName(first,last);
	}
	//Method to set firstName and lastName with parameters
	public void setName(String first, String last) {
		firstName = first;
		lastName = last;
	}
	//Method to return firstName
	public String getFirstName() {
		return firstName;
	}
	//Method to return lastName
	public String getLastName() {
		return lastName;
	}
	//Method to output the first name and last name
	public String toString() {
		return firstName+" "+lastName;
	}
}
 
