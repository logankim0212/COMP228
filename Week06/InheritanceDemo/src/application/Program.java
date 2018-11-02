package application;

public class Program {
	public static void main(String[] args) {
		// Declarations & Initializations
		Employee emp1 = new Employee("John Smith", 40.00, 25.00);
		Employee emp2 = new Employee("Mary Johnson", 20.00, 21.50);
		CEO ceo = new CEO("Harry Potter", 40.00, 70.00, 500.00, 5.00, 100);
		Employee[] empList = { emp1, ceo, emp2 };

		// print the information
		for(Employee emp : empList) {
			System.out.println("Employee:\t" + emp);
		}

//		// set the values for emp1
//		emp1.setName("Jphn Smith");
//		emp1.setHours(40.0);
//		emp1.setHourlySalary(25.00);
//
//		// set the values for ceo
//		ceo.setName("Harry Potter");
//		ceo.setHours(40.00);
//		ceo.setHourlySalary(70.00);
//		ceo.setBonus(500.00);
//		ceo.setStockPrice(5.00);
//		ceo.setNoOfShares(100);
//
//		// print the salary
//		System.out.println("The salary of emp1 is: " + emp1.calcPay());
//		System.out.println("The salary of emp1 is: " + ceo.calcPay());

	}
}
