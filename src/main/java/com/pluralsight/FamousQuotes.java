package com.pluralsight;

import java.util.Scanner;
import java.util.Random;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] tenQuotes = { //   Create an array of ten quotes.
                "'The only true wisdom is in knowing you know nothing.' - Socrates",
                "'I think, therefore I am.' - René Descartes",
                "'To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.' - Ralph Waldo Emerson",
                "'The unexamined life is not worth living.' - Socrates",
                "'In three words I can sum up everything I've learned about life: it goes on.' - Robert Frost",
                "'It is the mark of an educated mind to be able to entertain a thought without accepting it.' - Aristotle",
                "'The only way to do great work is to love what you do.' - Steve Jobs",
                "'The unexamined life is not worth living.' - Socrates",
                "'You miss 100% of the shots you don't take.' - Wayne Gretzky",
                "'The only thing necessary for the triumph of evil is for good men to do nothing.' - Edmund Burke"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueDisplaying = true; //   Controls loop block

        while (continueDisplaying) {
//          Prompt user to select a number between 1-10; or random quote = 0
            System.out.println("Select a number between 1 and 10; For a random quote select 0.");
            int choice;

            try {
//              Set user input as choice variable
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 10) {
                    System.out.println(tenQuotes[choice - 1]);
                } else if (choice == 0) {
//                  Bonus 2: Random quote function
                    int randomQuote = random.nextInt(10);
                    System.out.println(tenQuotes[randomQuote]);
                } else {
//                  Invalid user input path
                    System.out.println("Invalid choice. Please select a number between 1 and 10; For a random quote select 0.");
                }
            } catch (Exception e) {
//              Exception handling
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
                continue;
            }
//          Bonus 1: Looping program
            System.out.println("Do you want to see another saying? (yes or no):");
            String userResponse = scanner.next().toLowerCase();
            continueDisplaying = userResponse.equals("yes");
        }
//      Display exiting program.
        System.out.println("Goodbye! Now exiting...");
    }
}