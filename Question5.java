import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);

    //prompt
    System.out.print("");
    int num = in.nextInt();

    //store in array 
    int[] numbers = new int[100];

    //loop to track and add the frecuncy
    for (int i = 0; i < num; i++){
      System.out.print("> ");//for the carrot infront of number
      int input = in.nextInt();
      numbers[input]++; //add the number that appear once or more into array 
    }

    //need to check the array length and the num
    int sameNum = 0;
    int max = 0;
    for (int f = 0; f < numbers.length; f++){
      //if loop for knowing if the num in array appear how many times 
      if (numbers[f] > max){
        sameNum = f;
        max = numbers[f];
      }
    }

    System.out.print("" + sameNum);

  }
}
