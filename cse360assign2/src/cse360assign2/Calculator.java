package cse360assign2;

public class Calculator {
	
	/*
	 * Keeps track of the current value of our number that we are manipulating.
	 */
	private int total;
	
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
		return 0;
	}
	
	/*
	 * This method will add the specified value in the parameter to the total variable.
	 * 
	 * @oaram  value will specify the value to add to the total variable
	 * @return total will return the new value of the total variable after the add operation
	 */
	public void add (int value) {
		
	}
	
	/*
	 * This method will subtract the value in the parameter from the total variable.
	 * 
	 * @param value will specify the value to subtract from the total variable.
	 * @return total will return the new value of the total variable after the subtract operation
	 */
	public void subtract (int value) {
		
	}
	
	/*
	 * This method will multiply the value in the parameter by the specified value.
	 * 
	 * @param value will specify the value to multiply the total variable by.
	 * @return total will return the new value of the total variable after the multiply operation.
	 */
	public void multiply (int value) {
		
	}
	
	/*
	 * This method will divide the total variable by the specified value.
	 * 
	 * @param value will specify what value to divide the total variable by.
	 * @return total will return the new value of the total variable after the divide operation.
	 */
	public void divide (int value) {
		
	}
	
	/*
	 * This method will return all the performed operations in a single line
	 * 
	 * @return will return a String of all the performed operations from when we ran the calculator.
	 */
	public String getHistory () {
		return "";
	}
}
