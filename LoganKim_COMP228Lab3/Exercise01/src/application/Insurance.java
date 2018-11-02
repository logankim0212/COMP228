/** Exercise01: Insurance.java
 * Author: Logan Kim
 * Purpose: Java application that implements different types of insurance policies for employees of an organization.
 */
package application;

public abstract class Insurance {
	// field variables
	protected String _insuranceType;
	protected double _monthlyCost;

	// getters
	public String getInsuranceType() {
		return _insuranceType;
	}
	public double getMonthlyCost() {
		return _monthlyCost;
	}

	// abstract methods
	public abstract void setMonthlyCost(double monthlyCost);
	public abstract void displayInfo();
} // end class
