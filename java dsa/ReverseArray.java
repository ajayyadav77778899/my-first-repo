import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int arr[] = { 7, 5, 9, 4 }; // {7,6,4,5,6}
    int arrlen = arr.length - 1;
    System.out.println(arrlen);

    int i = 0;
    int temp;
    while (i != (arr.length / 2)) {
      temp = arr[i];
      arr[i] = arr[arrlen];
      arr[arrlen] = temp;
      i++;
      arrlen--;
    }
    System.out.println(Arrays.toString(arr));

  }
}
