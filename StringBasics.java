import java.util.Scanner;

public class StringBasics {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // creating Strings
    String str = "Shivam";
    System.out.println(str);

    String atr = new String("Dubey");
    System.out.println(atr);

    String firstName = "Aegon";
    String lastName = new String("Targaryen");

    System.out.println(firstName + " " + lastName);

    System.out.println(firstName.length());
    System.out.println(firstName.charAt(3));

    // Comparing Strings
    String name1 = "Jon";
    String name2 = "JON";

    if (name1.equalsIgnoreCase(name2)) {
      System.out.println("Both Strings are equal");
    } else {
      System.out.println("Both Strings are not equal");
    }

    // Taking string inputs
    System.out.println("Provide the string content: ");
    String btr = sc.nextLine();
    System.out.println("Value: " + btr);

    System.out.println("Provide the string content: ");
    String btr2 = sc.next();
    System.out.println("Value: " + btr2);
  }
}
