import java.util.Arrays;

public class KthSmallest {
  public static void main(String args[]) {
    int arr[] = { 7, 10, 5, 4, 3 };
    int kth = 3;
    Arrays.sort(arr);
    System.out.println(arr[kth - 1]);

  }
}