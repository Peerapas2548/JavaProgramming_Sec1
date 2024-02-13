
public class ATMData {
	private String accountNumer,password;
	
	public  ATMData(String accountNumber,String password) {
		this.accountNumer=accountNumber;
		this.password=password;
	}
	public String getID() {
		return this.accountNumer;
	}
	public String getPass() {
		return this.password;
	}
}
