package cse360assign2;
/*
 * Represents a calculator that is able to perform add, subtract, multiply, and divide operations.
 * 
 * @author Kyle Gonzalez
 */
public class Calculator {
	
	/*
	 * Keeps track of the current value of our number that we are manipulating.
	 */
	private int total;
	
	/*
	 * Keeps a string of all the performed operations, will be concatenated to for each operation.
	 * It is automatically set to 0.
	 */
	private String fullHistory = Integer.toString(total);
	
	/*
	 * Constructor that allows usage of the methods in this class that will be used to manipulate the total variable.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * This method will return the current value of the total variable.
	 * 
	 * @return the current value of the Calculator's total variable.
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * This method will add the specified value in the parameter to the total variable.
	 * 
	 * @oaram  value will specify the value to add to the total variable
	 */
	public void add (int value) {
		total += value;
		fullHistory += " + " + Integer.toString(value);
	}
	
	/*
	 * This method will subtract the value in the parameter from the total variable.
	 * 
	 * @param value will specify the value to subtract from the total variable.
	 */
	public void subtract (int value) {
		total -= value;
		fullHistory += " - " + Integer.toString(value);
	}
	
	/*
	 * This method will multiply the value in the parameter by the specified value.
	 * 
	 * @param value will specify the value to multiply the total variable by.
	 */
	public void multiply (int value) {
		total *= value;
		fullHistory += " * " + Integer.toString(value);
	}
	
	/*
	 * This method will divide the total variable by the specified value. If the value is 0, then we change the total value to 0.
	 * 
	 * @param value will specify what value to divide the total variable by.
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
		
		fullHistory += " / " + Integer.toString(value);
	}
	
	/*
	 * This method will return all the performed operations in a single line
	 * 
	 * @return fullHistory will return all the operations that have been performed on the total variable in String format.
	 */
	public String getHistory () {
		return fullHistory;
	}
}
