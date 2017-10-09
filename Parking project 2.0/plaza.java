package insa;

import java.util.Scanner;

public class Plaza {
	
	public static void main(String[] args) {

		int count1 = 0; //keeps count of vehicles on level1
		int count2 = 0; //keeps count of vehicles on level2
		final int size1 = 25;
		final int size2 = 25;

		int i, j;

		int [][] level1 = new int[5][5]; //Plaza has 2 levels, each level has 5x5 slots. All slots are initialized as 0.
		int [][] level2 = new int[5][5]; 
		System.out.println("Choose action\n1: Enter new vehicle\n2: Remove vehicle\n3: Show lots available");
		Scanner line = new Scanner(System.in);
		int action = line.nextInt();
		switch (action){
			case 1:
				System.out.println("Enter type of vehicle (1 = car, 2 = truck, 3 = motorcycle):");
				Scanner a = new Scanner(System.in);
				int type = a.nextInt();
				
				if (type == 1){
				
				}
				
				if (type == 2){
					
				}
				
				if (type == 3){
					
				}
				
				
				
				
				if (count1 < size1){			//Check level1 and add vehicle to next free spot
					for(i=0; i<=5; i++){
						for(j=0; j<=5; j++){
							if(level1[i][j] == 0){
								level1[i][j] = 1;
								count1++;
								break;
							}
						}
					}
				}
				else if (count2 < size2){		//Check level2
					for(i=0; i<=5; i++){
						for(j=0; j<=5; j++){
							if(level2[i][j] == 0){
								level2[i][j] = 1;
								count2++;
								break;
							}
						}
					}
				}
				else{
					System.out.println("Parking Plaza is FULL, sorry.");
				}
			case 2:
				
			case 3:
				int lotsAvailable = 50 - count1 - count2;
				System.out.println("Lots available: " + lotsAvailable);
}
}
}
