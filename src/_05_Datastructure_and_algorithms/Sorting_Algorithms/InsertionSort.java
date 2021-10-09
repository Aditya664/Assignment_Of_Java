package Sorting_Algorithms;

public class InsertionSort {
  public static void main(String[] args) {
    int[] list = {6, 2, 8, 4, 10, 3, 7, 0, 9};
    sort(list);
    for (int i : list) {
      System.out.print(i + "   ");
    }
  }

  private static void sort(int[] list) {
    for (int index = 0; index < list.length; index++) {
      int checkPoint = index - 1;
      int current = list[index];
      while (checkPoint >= 0 && list[checkPoint] > current) {
        list[checkPoint + 1] = list[checkPoint];
        checkPoint--;
      }

      list[checkPoint + 1] = current;
    }
  }
}
