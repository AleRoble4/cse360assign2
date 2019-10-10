package cse360assign2;
import java.util.Scanner;

public class Test {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.getTotal();
		myCalculator.subtract(2);
		myCalculator.getTotal();
		myCalculator.add(5);
		myCalculator.getTotal();
		myCalculator.toString();
		myCalculator.clear();
		myCalculator.toString();

	}

}
