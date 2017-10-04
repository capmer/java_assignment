package insa;

import java.util.Scanner;

public class Plaza {
	
	private int counter; //keeps count of cars inside the plaza
	private final int SIZE = 100;
	
	int [][] level1 = new int[5][10]; //Plaza has 3 levels, each level has 5x10 slots. All slots are initialized as 0.
	int [][] level2 = new int[5][10]; 

	public static void main(String[] args) {

		System.out.println("1: Car \n2: Truck \n3: Motorcycle \nEnter vehicle type:");
		Scanner line = new Scanner(System.in);
		carType = line.nextLine();
		counter++;
	}

}

