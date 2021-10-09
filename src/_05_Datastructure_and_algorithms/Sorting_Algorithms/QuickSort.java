package Sorting_Algorithms;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = {40, 80, 20, 60, 120, 100, 90, 70};
    int l = 0, h = arr.length - 1;

    sort(arr, l, h);

    for (int item : arr) {
      System.out.print(item + "  ");
    }
  }

  public static void sort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot_index = partition(arr, low, high);
      sort(arr, low, pivot_index - 1);
      sort(arr, pivot_index, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int i = low - 1, temp;
    int pivot = arr[high];
    for (int j = low; j <= high; j++) {
      if (arr[j] < pivot) {
        i++;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    temp = arr[i + 1];
    arr[i + 1] = pivot;
    arr[high] = temp;
    return i + 1;
  }
}
