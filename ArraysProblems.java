public class ArraysProblems {

  static int findUnSortedElement(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i + 1] <= arr[i]) {
          return arr[i + 1];
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 5, 3, 9 };
    int ans = findUnSortedElement(arr);
    System.out.println(ans);
  }

  // find zeroes and ones in an array
  // static int[] findZeroesOnes(int[] arr) {
  // int zeroesCount = 0;
  // int onesCount = 0;
  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] == 0) {
  // zeroesCount++;
  // } else if (arr[i] == 1) {
  // onesCount++;
  // }
  // }
  // // return new int[] { zeroesCount, onesCount };
  // int ans[] = { zeroesCount, onesCount };
  // return ans;
  // }

  // public static void main(String[] args) {
  // int[] arr = { 1, 0, 0, 1, 0, 0, 1, 0, 9, 6, 7, 8 };
  // int[] ans = findZeroesOnes(arr);
  // System.out.println("The total numbers of zeroes are: " + ans[0]);
  // System.out.println("The total numbers of ones are: " + ans[1]);
  // }

  // Sum of positive and negative numbers in an array
  // static int[] getPosNegSum(int[] arr) {
  // int posSum = 0;
  // int negSum = 0;

  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] >= 0) {
  // posSum += arr[i];
  // } else {
  // negSum += arr[i];
  // }
  // }

  // return new int[] { posSum, negSum };
  // }

  // public static void main(String[] args) {
  // int[] arr = { 1, -2, 3, -4, 5, -6, 8 };
  // int[] ans = getPosNegSum(arr);
  // System.out.println("The sum of positive numbers is: " + ans[0]);
  // System.out.println("The sum of negative numbers is: " + ans[1]);
  // }

  // Maximum element in an array
  // static int getmaxElement(int arr[]) {
  // int max = arr[0];
  // for (int i = 1; i < arr.length; i++) {
  // if (arr[i] > max) {
  // max = arr[i];
  // }
  // }
  // return max;
  // }

  // public static void main(String[] args) {
  // int arr[] = { 1, 2, 7, 8, 9, 6, 5 };
  // int ans = getmaxElement(arr);
  // System.out.println(ans);
  // }

  // Linear Search
  // static boolean findTarget(int arr[], int target) {
  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] == target) {
  // return true;
  // }
  // }
  // return false;
  // }

  // public static void main(String[] args) {
  // int arr[] = { 1, 2, 7, 8, 9, 6, 5 };
  // boolean ans = findTarget(arr, 7);
  // System.out.println(ans);
  // }

  // Multiply by 10

  // static int[] multiplyBy10(int[] arr) {
  // int size = arr.length;
  // int[] newArray = new int[size];
  // for (int i = 0; i < size; i++) {
  // int element = arr[i];
  // int newElement = element * 10;
  // newArray[i] = newElement;
  // }
  // return newArray;
  // }

  // public static void main(String[] args) {
  // int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
  // int ans[] = multiplyBy10(arr);
  // for (int i : ans) {
  // System.out.println(i);
  // }

  // Average of an array

  // static double getAverage(int[] arr) {
  // int sum = 0;
  // for (int i : arr) {
  // sum += i;
  // }
  // int size = arr.length;
  // double value = (double) sum / size;
  // double average = value;
  // // double average = (double) sum / size;
  // return average;
  // // for (int i = 0; i < size; i++) {
  // // sum += arr[i];
  // // }
  // }

  // public static void main(String[] args) {
  // int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
  // System.out.println("The average of the array is: " + getAverage(arr));

  // Average of an array
  // int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
  // int sum = 0;
  // int size = arr.length;
  // for (int i = 0; i < size; i++) {
  // sum += arr[i];
  // }
  // double average = sum / size;
  // System.out.println("The average of the array is: " + average);
}
