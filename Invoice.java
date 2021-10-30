public class Invoice {
	//Attributes
	String contact_details;
	String customer_name;
	String customer_surname;
	double balance;
	double total_fee;
	double total_paid;
	//Constructors
	public Invoice(String contact_details,String customer_name,String customer_surname,double balance,double total_fee,double total_paid)  {
		this.contact_details = contact_details;
		this.customer_name = customer_name;
		this.customer_surname = customer_surname;
		this.balance = balance;
		this.total_fee = total_fee;
		this.total_paid = total_paid;
	}
	//Methods
	public String getContactDetails() {
		return contact_details;
	}
	public String getCustomer() {
		String customerinfo = customer_name;
		customerinfo += customer_surname;
		return customerinfo;
	}
	public double getBalance() {
		double balance = total_fee - total_paid;
		return balance;
	}
	public double getTotalFee() {
		return total_fee;
	}
	public double getTotalPaid() {
		return total_paid;
	}
	public String toString() {
		String info =  "Contact Details = " + contact_details;
		info +=  "\nCustomer Name = " + customer_name;
		info += "\nCustomer Surname = " + customer_surname;
		info += "\nBalance = " + balance;
		info += "\nTotal Fee = " + total_fee;
		info += "\nTotal Paid = " + total_paid;
		return info;
	}
}
