package oops.practice.discountsystem;

import java.util.Date;

public class Visit {
	private Customer name;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit() {
	}

	public Visit(Customer name, Date date) {
		super();
		this.name = name;
		this.date = date;
		
	}

	public Customer getName() {
		return name;
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
		return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));
	}

	@Override
	public String toString() {
		return "Visit [customer=" + name + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}

}
