import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
     Scanner in = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter Integer: ");
        
        // Read the integer input
        int num = in.nextInt();

        // Close the Scanner object to avoid resource leak
        in.close();

        // Multiply the integer by itself
        int result = num * num;

        // Print out the result
        System.out.println("Result: " + result);




    
  }

  
}


