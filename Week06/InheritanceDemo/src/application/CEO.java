package application;

public class CEO extends Employee {
	public CEO(String newName, double hours, double hourlySalary, double bonus, double price, int shares) {
		// reference the parameterized constructor in the super class
		super(newName, hours, hourlySalary);
		this._bonus = bonus;
		this._noOfShares = shares;
		this._stockPrice = price;
	}

	private double _bonus;
	private double _stockPrice;
	private int _noOfShares;

	public double getBonus() {
		return _bonus;
	}

	public void setBonus(double bonus) {
		this._bonus = bonus;
	}

	public double getStockPrice() {
		return _stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this._stockPrice = stockPrice;
	}

	public int getNoOfShares() {
		return _noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this._noOfShares = noOfShares;
	}

	@Override
	public double calcPay() {
		return (this._hours * this._hourlySalary +
				this._bonus + (this._stockPrice * this._noOfShares));
	}
}
