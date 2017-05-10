package structure.model;

public class Customer 
{
	private int customerNumber;
	private String customerWords;
	
	public Customer()
	{
		customerWords = "Noething";
		customerNumber = -199;
	}
	
	public Customer(String customerWords, int customerNumber)
	{
		this.customerWords = customerWords;
		this.customerNumber = customerNumber;
	}

}
