import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
     
     Scanner in = new Scanner(System.in);

        // Prompt the user to enter an integer
        //System.out.print("");
        
        // Read the integer input
        int num = in.nextInt();

        // Close the Scanner object to avoid resource leak
        in.close();

        // Multiply the integer by itself
        int result = num * num;

        // Print out the result
        //System.out.println(result);




    
  }

  
}


