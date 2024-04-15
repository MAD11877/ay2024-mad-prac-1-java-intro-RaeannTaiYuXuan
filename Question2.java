import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /**
         * Prompts user for height and weight, calculate and print out the BMI of the user
         * 
         * Hint: in.nextDouble() to read double
         */

        Scanner in = new Scanner(System.in);

        // Prompt the user for height
        System.out.print("Enter your height (in meters): ");
        double height = in.nextDouble();

        // Prompt the user for weight
        System.out.print("Enter your weight (in kilograms): ");
        double weight = in.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(height, weight);

        // Print the BMI
        System.out.println("Your BMI is: " + bmi);
    }

    // Method to calculate BMI
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
