import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Prompt the user for height
        
        double height = in.nextDouble();

        // Prompt the user for weight
        
        double weight = in.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(height, weight);

        // Print the BMI
        System.out.println(bmi);
    }

    // Method to calculate BMI
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
