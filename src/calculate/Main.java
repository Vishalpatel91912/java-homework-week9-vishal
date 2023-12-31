package calculate;
/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main extends Calculator { // parent class
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); // using scanner for data input
        char answer; // storing single character in answer

        do { //using do while loop for taking permission from the client for calculation as many as he wants to do
            System.out.println("Enter first Number"); //first number printing
            int a = scanner.nextInt(); // first number storing in variable a
            System.out.println("Enter Second Number"); // second number message
            int b = scanner.nextInt(); // second number storing in variable b
            System.out.println("Please enter one of symbol +,-,*,/:"); // asking for select the mathematical symbol
            char symbol = scanner.next().charAt(0); // storing symbol

            Main obj = new Main(); // creating main class object
            obj.calculateResult(a, b, symbol); // calling the calculateResult method

            System.out.println("Would you like to do more calculations ? Please enter Y or N");
            answer = scanner.next().charAt(0); // storing the answer in answer
        } while (answer == 'Y' || answer == 'y'); // while loop for repeating the process if select Y or y

        System.out.println("Program terminated");
        scanner.close(); // closing scanner

    }
}
