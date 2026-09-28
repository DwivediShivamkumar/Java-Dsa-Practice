public class methods {
  // method declaration/definition
  static void print2table() {
    for (int i = 1; i <= 10; i++) {
      int ans = 2 * i;
      System.out.println(ans);
    }
  }

  static void printSum(int x, int y) {
    int ans = x + y;
    System.out.println("Sum: " + ans);
  }

  static void printMultiplication(int a, int b) {
    int ans = a * b;
    System.out.println("Result: " + ans);
  }

  static int printsum(int y, int z) {
    int ans = y + z;
    return ans;
  }

  static int printsum(int a, int b, int c) {
    int sum = a + b + c;
    return sum;
  }

  public static void main(String[] args) {
    int ans1 = printsum(2, 4);
    int ans2 = printsum(4, 6, 9);
    System.out.println("ans1: " + ans1);
    System.out.println("ans2: " + ans2);
  }
  // public static void main(String[] args) {
  // int add = printsum(78, 5);
  // System.out.println("Result: " + add);
  // }
  // public static void main(String[] args) {
  // printMultiplication(4, 5);
  // }
  // public static void main(String[] args) {
  // printSum(6, 12);
  // }

  // method call/invoke
  // public static void main(String[] args) {
  // System.out.println("Hi");
  // print2table();
  // System.out.println("Bye");
  // }
}
