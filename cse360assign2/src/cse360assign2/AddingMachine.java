package cse360assign2;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Represents a calculator and can do multiple functions
 * such as add and subtract while displaying a total
 */
public class AddingMachine {
	
	Scanner scan = new Scanner(System.in);
	
	private int total;
	private ArrayList<String> history = new ArrayList<String>();
	
	/*
	 * Constructor
	 */
	public AddingMachine () {
		
	}
	
	/**
	 * Method to get the total for an operation.
	 */
	public int getTotal () {
		System.out.println("Total: " + total);
		return total;
	}
	
	/**
	 * Method used to add to a number.
	 */
	public void add (int value) {
		total = total + value;
		history.add("+ " + value);
	}
	
	/**
	 * Method used to subtract from a number.
	 */
	public void subtract (int value) {
		total = total - value;
		history.add("- " + value);
	}
	
	/**
	 * Method to keep history of transaction and display. 
	 */
	public String toString () {
		System.out.print("0 ");
		for(String name:history)
		{
			System.out.print(name + " ");
		}
		return "";
	}

	/**
	 * N/A
	 */
	public void clear() {
	
	}
}
