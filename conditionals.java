import java.util.Scanner;

public class conditionals {
  public static void main(String[] args) {

    System.out.println("Enter the case number: ");
    Scanner sc = new Scanner(System.in);
    int caseNumber = sc.nextInt();

    switch (caseNumber) {
      case 1:
        System.out.println("Excellent! Case 1 selected.");
        break;
      case 2:
        System.out.println("Good! Case 2 selected.");
        break;
      case 3:
        System.out.println("Wow! Case 3 selected.");
        break;
      default:
        System.out.println("Invalid case number.");
    }

    // int time = 2;
    // String foodTime = (time < 3) ? "Breakfast" : "Lunch";
    // System.out.println("It's time for " + foodTime + "!");

    // boolean hasInsurance = true;
    // String claim = "valid";

    // if (hasInsurance) {
    // if (claim.equals("valid")) {
    // System.out.println("Your claim is valid.");
    // } else {
    // System.out.println("Your claim is invalid.");
    // }
    // } else {
    // System.out.println("You are not eligible for any services.");
    // }

    // int marks = 40;
    // if (marks >= 40) {
    // System.out.println("You have passed the exam!");
    // } else {
    // System.out.println("You h ave failed the exam!");
    // }
    // System.out.println("This is a basic Java program." + " I will learn java.");

    // Scanner input = new Scanner(System.in);

    // System.out.println("Enter the problem: ");
    // String problem = input.nextLine();

    // if (problem.equals("She is greedy")) {
    // System.out.println("She is a bad director!");
    // } else if (problem.equals("She is bad and greedy")) {
    // System.out.println("She is an evil director!");
    // } else {
    // System.out.println("I don't know about her.");
    // }

    // int codingPractice = 6;
    // if (codingPractice > 5) {
    // System.out.println("Good Consistency!");
    // }

    // int age = 19;
    // if (age >= 18) {
    // System.out.println("You are eligible to vote!");
    // }

    // int shamta = 2;
    // if (shamta == 2) {
    // System.out.println("She is a bad director!");
    // }

  }
}
