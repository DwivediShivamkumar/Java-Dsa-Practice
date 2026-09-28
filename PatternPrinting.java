public class PatternPrinting {
  public static void main(String[] args) {
    // for (int i = 1; i <= 4; i++) {
    // for (int j = 1; j <= 4; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 4;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 3;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= 5; col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" ");
    // }
    // for (int col = 1; col <= 5; col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row + 1; col++) {
    // System.out.print("* ");
    // }
    // // for (int col = 1; col <= n - row; col++) {
    // // System.out.print(" ");
    // // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" ");
    // }
    // for (int col = 1; col <= 2 * row - 1; col++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // int n = 4;

    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row - 1; col++) {
    // System.out.print(" ");
    // }
    // for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // int n = 4;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= 6; col++) {
    // if (row == 1 || row == n) {
    // System.out.print("* ");
    // } else {
    // if (col == 1 || col == 6) {
    // System.out.print("* ");
    // // } else if (col == 6) {
    // // System.out.print("* ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= 5; row++) {
    // if (row == 1 || row == 2 || row == 5) {
    // for (int col = 1; col <= row; col++)
    // System.out.print("* ");
    // } else {
    // System.out.print("* ");
    // for (int col = 1; col <= (row - 2); col++) {
    // System.out.print(" ");
    // }
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= (n - row); col++) {
    // System.out.print(" ");
    // }
    // if (row == 1 || row == n) {
    // for (int col = 1; col <= (2 * row - 1); col++) {
    // System.out.print("* ");
    // }
    // } else {
    // System.out.print("* ");
    // for (int col = 1; col <= (2 * row - 3); col++) {
    // System.out.print(" ");
    // }
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // // part 1
    // int n = 4;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" ");
    // }
    // for (int col = 1; col <= (2 * row - 1); col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // // part 2
    // for (int row = 1; row <= n; row++) {
    // if (row == 1) {
    // continue;
    // }
    // for (int col = 1; col <= row - 1; col++) {
    // System.out.print(" ");
    // }
    // for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 4;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= (n - row); col++) {
    // System.out.print(" ");
    // }
    // if (row == 1) {
    // for (int col = 1; col <= (2 * row - 1); col++) {
    // System.out.print("* ");
    // }
    // } else {
    // System.out.print("* ");
    // for (int col = 1; col <= (2 * row - 3); col++) {
    // System.out.print(" ");
    // }
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // // part 2
    // for (int row = 1; row <= (n - 1); row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(" ");
    // }
    // if (row == n - 1) {
    // System.out.print("* ");
    // } else {
    // System.out.print("* ");
    // for (int col = 1; col <= (2 * (n - row) - 3); col++) {
    // System.out.print(" ");
    // }
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 4;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print("* ");
    // }
    // for (int col = 1; col <= 2 * (n - row); col++) {
    // System.out.print(" ");
    // }

    // for (int col = 1; col <= row; col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= (n - row + 1); col++) {
    // System.out.print("* ");
    // }
    // for (int col = 1; col <= (2 * row - 2); col++) {
    // System.out.print(" ");
    // }
    // for (int col = 1; col <= (n - row + 1); col++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // int n = 5;

    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(col + " ");
    // }
    // System.out.println();
    // }

    // int n = 5;
    // int count = 1;

    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(count + " ");
    // count++;
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // int a = col;
    // int b = ('A' - 1);
    // int ans = a + b;
    // // int ans = (col + 96);
    // char finalAns = (char) ans;
    // System.out.print(finalAns + " ");
    // }
    // System.out.println();
    // }

    // int n = 5;

    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // int a = n - col;
    // int b = 'A';
    // int ans = a + b;
    // char finalAns = (char) ans;
    // System.out.print(finalAns + " ");
    // }
    // System.out.println();
    // }

    // int n = 4;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" ");
    // }

    // // int count = 1;
    // // for (int col = 1; col <= row; col++) {
    // // System.out.print(count + " ");
    // // count++;
    // // }
    // for (int col = 1; col <= row; col++) {
    // System.out.print(col + " ");
    // }

    // int value = row;
    // int decRowValue = row - 1;
    // for (int col = 1; col <= row - 1; col++) {
    // System.out.print(decRowValue + " ");
    // decRowValue--;
    // }
    // System.out.println();
    // }

    // int n = 4;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n - row; col++) {
    // System.out.print(" ");
    // }
    // for (int col = 1; col <= 2 * row - 1; col++) {
    // System.out.print(row + " ");
    // }
    // System.out.println();
    // }

    int n = 4;
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row; col++) {
        System.out.print("  ");
      }

      for (int col = 1; col <= row; col++) {
        int a = col;
        int b = 'A' - 1;
        int ans = a + b;
        char finalAns = (char) ans;
        System.out.print(finalAns + "  ");
      }

      char toPrint = (char) (row + 'A' - 2);
      for (int col = 1; col <= row - 1; col++) {
        System.out.print(toPrint + "  ");
        toPrint--;
      }
      System.out.println();
    }

  }
}
