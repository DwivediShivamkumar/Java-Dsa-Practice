import java.util.Scanner;

public class recursion {

  // Infinite recursion causes Stack overflow

  // public static void print() {
  // System.out.println(1);
  // print();
  // }

  // public static void main(String[] args) {
  // print();
  // }

  // Base condition to stop STACK OVERFLOW

  // static int count = 0;

  // public static void counting() {
  // if (count > 2) {
  // return;
  // }
  // System.out.println(count);
  // count++;
  // counting();
  // }

  // public static void main(String[] args) {
  // counting();
  // }

  // Some recursion problems to practice

  // 1) Print Your name n times using recursion;

  // public static void name(int i, int n) {
  // if (i > n) {
  // return;
  // }
  // System.out.println("Shivam Dubey");
  // name(i + 1, n);
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // name(1, n);
  // }

  // 2) Print linearly from 1 to N

  // public static void linear(int i, int n) {
  // if (i > n) {
  // return;
  // }
  // System.out.println(i);
  // linear(i + 1, n);
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // linear(1, n);
  // }

  // 3) Print in terms of N to 1
  // public static void reverse(int n, int i) {
  // if (n < i) {
  // return;
  // }
  // System.out.println(n);
  // reverse(n - 1, 1);
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // reverse(n, 1);
  // }

  // 4) Print linearly from 1 to N But by backtracking.

  // public static void increase(int i, int n) {
  // if (i < 1) {
  // return;
  // }
  // increase(i - 1, n);
  // System.out.println(i);
  // }

  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // increase(n, n);
  // }

  // 5) Print from n to 1 by backtracking

  public static void decrease(int i, int n) {
    if (i > n) {
      return;
    }

    decrease(i + 1, n);
    System.out.println(i);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    decrease(1, n);
  }
}
