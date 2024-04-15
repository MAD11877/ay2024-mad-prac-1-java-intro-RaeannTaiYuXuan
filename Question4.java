import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);

    //prompt for base integer
    System.out.print("");

    int base = in.nextInt();

    //two loops (for...)
    for (int i = base; i > 0; i--){
      //inner loop for printing out "*"
      for(int a = 0; a < i; a++){
        System.out.print("*");
      }
      //is to make spacing for each line
      System.out.println();
    }

     


  }
}
