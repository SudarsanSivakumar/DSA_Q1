package q1.gp.dsa;

import java.util.Scanner;


public class Driver {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the total number of floors in the building: ");
	        int n = scanner.nextInt();

	        int[] floors = new int[n];
	        System.out.println("Enter the floor sizes given by factories on each day:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Day " + (i+1) + ": ");
	            floors[i] = scanner.nextInt();
	        }

	        Main analyzer = new Main();
	        String[] assemblyOrder = analyzer.getAssemblyOrder(floors);

	        System.out.println("The order of construction is as follows:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Day " + (i+1) + ": ");
	            if (assemblyOrder[i] == null) {
	                System.out.println();
	            } else {
	                System.out.println(assemblyOrder[i]);
	            }
	        }

	        scanner.close();
	    }

}
