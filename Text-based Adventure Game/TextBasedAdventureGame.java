/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text.based.adventure.game;

/**
 *
 * @author Harapriya Sasmal
 */
import java.util.Scanner;
public class TextBasedAdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious place...");

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Explore");
            System.out.println("2. Quit");

            
            int choice = getUserChoice(scanner);
            
            switch (choice) {
                case 1:
                    explore();
                    break;
                case 2:
                    System.out.println("Thanks for playing. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextInt();
    }

    private static void explore() {
        System.out.println("You decide to explore...");

        // Add more game logic for exploration

        System.out.println("You continue your adventure...");
    }
}

