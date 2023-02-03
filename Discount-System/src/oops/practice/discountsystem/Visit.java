package oops.practice.discountsystem;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit() {
	}

	public Visit(Customer customer, Date date, double serviceExpense, double productExpense) {
		super();
		this.customer = customer;
		this.date = date;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}

	public Customer getCustomer() {
		return customer;
	}

	

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		 this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}
	
	public double getTotalExpense() {
		return 00.0;
	}

	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}

}
