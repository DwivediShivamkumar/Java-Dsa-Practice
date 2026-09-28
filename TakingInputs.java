import java.util.Scanner;

public class TakingInputs {
  public static void main(String[] args) {
    // Code for taking inputs
     
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter the value of the first num: ");  
    int firstNum = sc.nextInt();
  

    System.out.println("Enter the value of the second num: ");
     int secondNum = sc.nextInt();
    
    int ans = firstNum + secondNum;
    System.out.println("The answer is: " + ans);

    sc.close();
  }
}
