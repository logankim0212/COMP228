/** Exercise01: PersonalMortgage.java
 * Author: Logan Kim
 * Purpose: Java application that keeps track of mortgages and computes the total amount owed at any time (mortgage amount + interest).
 */
package application;

public class PersonalMortgage extends Mortgage {
	// constructor
	public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, String term) {
		_mortgageNumber = mortgageNumber;
		_customerName = customerName;
		_mortgageAmount = mortgageAmount;
		_interestRate = interestRate + 2;
		_term = term;
		_totalAmount = _mortgageAmount + _mortgageAmount * (_interestRate / 100);
	} // end constructor

	// override methods
	@Override
	public void getMortgageInfo() {
		System.out.println("**Business Mortgage**\nMortgage Number: " + getMortgageNumber() + "\nCustomer Name: " + getCustomerName() +
				"\nMortgage Amount: $" + getMortgageAmount() + "\nInterest Rate: " + getInterestRate() + "%" + "\nTerm: " + getTerm() +
				"\nTotal Amount: " + _totalAmount);
	} // end getMortgageInfo
} // end class
