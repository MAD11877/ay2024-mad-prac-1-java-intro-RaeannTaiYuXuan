import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);

    //prompt
    //System.out.print("");
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

    System.out.print(sameNum);

  }
}
