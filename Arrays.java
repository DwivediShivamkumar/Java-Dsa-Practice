//import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {

    int[][] arr = {
        { 1, 2, 3 }, { 4, 55, 6 }, { 7, 8, 91 }, { 3, 2, 1 },
    };
    int multi = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        multi *= arr[i][j];
      }
    }
    System.out.println(multi);

    // int[][] arr = {
    // { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 3, 2, 1 },
    // };
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // sum += arr[i][j];
    // }
    // }
    // System.out.println(sum);

    // int[][] arr = new int[3][4];
    // Scanner sc = new Scanner(System.in);
    // // for input
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.println("Enter the value of row " + i + " and the value of column
    // " + j);
    // arr[i][j] = sc.nextInt();
    // }
    // }
    // for printing it.
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    // int[][] arr = {
    // { 1, 2, 3 }, { 5, 6, 3, 8 }, { 7, 8, 8, 9, 3 }, { 1, 2 },
    // };
    // for (int i = 0; i <= arr.length - 1; i++) {
    // for (int j = 0; j <= arr[i].length - 1; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // int m = arr[i].length;
    // for (int j = 0; j < m; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }
    // for (int[] ans : arr) {
    // for (int ele : ans) {
    // System.out.print(ele + " ");
    // }
    // System.out.println();
    // }

    // // 2D-Arrays;
    // // declaration
    // int[][] arr;
    // // Allocation
    // arr = new int[3][4];
    // // initiallization
    // int[][] brr = {
    // { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 2, 3, 4 },
    // };
    // int rowLength = brr.length;
    // int colLength = brr[0].length;
    // // System.out.println(brr[0][0]);
    // for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
    // for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
    // System.out.print(brr[rowIndex][colIndex] + " ");
    // }
    // System.out.println();
    // }

    // int arr[] = { 2, -5, -99, 89, 95, -2 };
    // int n = arr.length;
    // int minValue = arr[0];
    // for (int i = 0; i < n; i++) {
    // if (arr[i] < minValue) {
    // minValue = arr[i];
    // }
    // }
    // System.out.println(minValue);

    // int arr[] = { 5, -6, 87, 4, 89, 96 };
    // int n = arr.length;
    // int maxValue = arr[0];
    // // compare the maxValue of the values of each element of the array;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] > maxValue) {
    // // update maxValue
    // maxValue = arr[i];
    // }
    // }
    // System.out.println(maxValue);

    // int arr[] = { 2, 3, 10, 20 };
    // int n = arr.length;
    // // int Multiplication = 1;
    // int ans = 1;
    // for (int i = 0; i < n; i++) {
    // // Multiplication *= arr[i];
    // int value = arr[i];
    // ans = ans * value;
    // }
    // System.out.println(ans);

    // int arr[] = { 20, 30, 40, 50, 60 };
    // int n = arr.length;
    // int sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum += arr[i];
    // }
    // System.out.println(sum);

    // Scanner sc = new Scanner(System.in);
    // int arr[] = new int[5];
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // System.out.println("Enter the arrays: " + i);
    // arr[i] = sc.nextInt();
    // }
    // int sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum += arr[i];
    // }
    // System.out.println("The total sum of Arrays are: " + sum);

    // int arr[] = { 123, 1345, 6789 };
    // int n = arr.length;
    // int sum = 0;
    // for (int i = 0; i <= n - 1; i++) {
    // sum += arr[i];
    // }
    // System.out.println(sum);
    // int sum = (arr[0] + arr[1] + arr[2]);
    // for (int index = 0; index <= n - 1; index++) {
    // System.out.println(sum);
    // }
    // Scanner sc = new Scanner(System.in);
    // int arr[] = new int[5];
    // int n = arr.length;
    // for (int i = 0; i <= n - 1; i++) {
    // System.out.println("Provide input for index: " + i);
    // arr[i] = sc.nextInt();
    // }
    // System.out.println("Your Array contains: ");
    // for (int val : arr) {
    // System.out.println(val);
    // }
    // // declaration
    // int arr[];
    // // allocation
    // arr = new int[5];
    // // init
    // int brr[] = { 5, 4, 8 };
    // // int n = brr.length;
    // for (int val : brr) {
    // System.out.println(val);
    // }
    // System.out.println(brr[1]);
    // int n = brr.length;
    // for (int index = 0; index <= n - 1; index++) {
    // System.out.println(brr[index]);
    // }

    // int[] arr = { 5, 6, 7, 8, 9, 4 };
    // System.out.println(arr[1]);

  }

}
