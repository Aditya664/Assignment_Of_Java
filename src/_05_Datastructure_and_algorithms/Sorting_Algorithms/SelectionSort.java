package Sorting_Algorithms;

public class SelectionSort {
  public static void main(String[] args) {
    int[] list = {6, 2, 8, 4, 10, 3, 7, 0, 9};
    sort(list);
    for (int i : list) {
      System.out.print(i + "   ");
    }
  }

  private static void sort(int[] list) {
    for (int pass = 0; pass < list.length; pass++) {
      int minPosition = pass;

      for (int index = pass; index < list.length; index++) {
        if (list[index] < list[minPosition]) {
          minPosition = index;
        }
      }

      int temp = list[pass];
      list[pass] = list[minPosition];
      list[minPosition] = temp;
    }
  }
}
