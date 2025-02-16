public class MaxMini {
  public static void main(String[] args) {
    int maxi = 0;
    int arry[] = { 7, 8, 2, 9, 77 };
    int mini = arry[0];
    int i = 0;

    while (i < arry.length) {
      if (maxi < arry[i]) {
        maxi = arry[i];
      }
      i++;
    }

    i = 0;
    while (i < arry.length) {
      if (mini > arry[i]) {
        mini = arry[i];
      }
      i++;
    }

    System.out.println(maxi);
    System.out.println(mini);
  }
}
