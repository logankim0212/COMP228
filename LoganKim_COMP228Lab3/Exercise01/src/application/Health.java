/** Exercise01: Health.java
 * Author: Logan Kim
 * Purpose: Java application that implements different types of insurance policies for employees of an organization.
 */
package application;

public class Health extends Insurance {
	// constructor
	public Health() {
		_insuranceType = "Health";
	} // end constructor

	// override methods
	@Override
	public void setMonthlyCost(double monthlyCost) {
		_monthlyCost = monthlyCost;
	} // end setter
	public void displayInfo() {
		System.out.println("Monthly fee of " + getInsuranceType() + " insurance is $" + getMonthlyCost());
	} // end method displayInfo
} // end class
