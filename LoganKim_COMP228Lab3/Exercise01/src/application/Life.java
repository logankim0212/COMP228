/** Exercise01: Life.java
 * Author: Logan Kim
 * Purpose: Java application that implements different types of insurance policies for employees of an organization.
 */
package application;

public class Life extends Insurance {
	// constructors
	public Life() {
		_insuranceType = "Life";
	} // end constructors

	// override methods
	@Override
	public void setMonthlyCost(double monthlyCost) {
		_monthlyCost = monthlyCost;
	} // end setter
	public void displayInfo() {
		System.out.println("Monthly fee of selected " + getInsuranceType() + " insurance is $" + getMonthlyCost());
	} // end displayInfo
} // end class
