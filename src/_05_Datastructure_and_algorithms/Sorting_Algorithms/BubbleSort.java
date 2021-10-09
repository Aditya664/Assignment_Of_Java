package Sorting_Algorithms;

public class BubbleSort {
  public static void main(String[] args) {
    int[] list = {6, 2, 8, 4, 10, 3, 7, 0, 9};
    sort(list);
    for (int i : list) {
      System.out.print(i + "   ");
    }
  }

  private static void sort(int[] list) {
    for (int pass = list.length - 1; pass >= 0; pass--) {
      for (int index = 0; index < pass; index++) {
        if (list[index] > list[index + 1]) {
          int temp = list[index];
          list[index] = list[index + 1];
          list[index + 1] = temp;
        }
      }
    }
  }
}
