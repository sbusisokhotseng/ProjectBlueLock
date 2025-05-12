package WasteSimulation;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        final int SMALL = 20;
			final int MEDIUM = 25;
			final int LARGE = 29;
	        // Map size selection
	        System.out.println("Choose map size:");
	        System.out.println("1. Small (20x20)");
	        System.out.println("2. Medium (25x25)");
	        System.out.println("3. Large (29x29)");
	        System.out.print("Enter your choice (1-3): ");
	        int sizeChoice = scanner.nextInt();
	        int mapSize = switch (sizeChoice) {
	            case 1 -> SMALL;
	            case 2 -> MEDIUM;
	            case 3 -> LARGE;
	            default -> {
	                System.out.println("Invalid choice. Defaulting to Small.");
	                yield SMALL;
	            }
	        };

	        // Robot skill selection
	        System.out.println("\nChoose robot skill:");
	        System.out.println("1. Beginner (FOV: 1)");
	        System.out.println("2. Intermediate (FOV: 2)");
	        System.out.println("3. Advanced (FOV: 3)");
	        System.out.print("Enter your choice (1-3): ");
	        int skillChoice = scanner.nextInt();
	        int fov = switch (skillChoice) {
	            case 1 -> 1;
	            case 2 -> 2;
	            case 3 -> 3;
	            default -> {
	                System.out.println("Invalid choice. Defaulting to Beginner.");
	                yield 1;
	            }
	        };

	        // Number of robots selection
	        System.out.println("\nNumber of robots:");
	        System.out.println("1. 1 robot");
	        System.out.println("2. 2 robots");
	        System.out.println("3. 3 robots");
	        System.out.println("4. 4 robots");
	        System.out.print("Enter your choice (1-4): ");
	        int robotChoice = scanner.nextInt();
	        int numRobots = switch (robotChoice) {
	            case 1 -> 1;
	            case 2 -> 2;
	            case 3 -> 3;
	            case 4 -> 4;
	            default -> {
	                System.out.println("Invalid choice. Defaulting to 1 robot.");
	                yield 1;
	            }
	        };

	        // Clear any remaining newline characters
	        scanner.nextLine();

	        System.out.println("\nStarting simulation with:");
	        System.out.println("- Map size: " + mapSize + "x" + mapSize);
	        System.out.println("- Robot skill: " + (fov == 1 ? "Beginner" : fov == 2 ? "Intermediate" : "Advanced"));
	        System.out.println("- Number of robots: " + numRobots);
	        System.out.println("\nPress Enter to begin the simulation...");
	        scanner.nextLine();

	        // Start the simulation
	        new WasteCollectionSimulation(mapSize, numRobots, fov);

	        System.out.println("\nSimulation started. Watch the robots collect waste!");
	        System.out.println("(The simulation will run automatically until completion)");
	    }

}
