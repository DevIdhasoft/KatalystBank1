package hw;
//Create a class like Employee called Customer with one function called GetInterestAmount() with 10% interest.
//Create a class like Manager called BankManager with four objects and calculate customer's interest. 
//Enhance calculator class to have the following 3 functions: Find whether a given string is available in our database or not, find the factorial of a number, reverse a string
public class Customer {
	int id;
	double AccountMoney;
	String name;
	String AcctType;
	Customer(){}
	Customer(int id, String name,double AccountMoney, String AcctType){
		this.id=id;
		this.AccountMoney=AccountMoney;
		this.name=name;
		this.AcctType = AcctType;
	}
	public double GetInterestAmount() {
		return AccountMoney * 0.1;
	}
	
}
