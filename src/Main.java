import java.util.Arrays;
import templates.BinarySearch;
import templates.MergeSort;
import templates.QuickSelect;
import templates.QuickSort;

public class Main {

  public static void main(String[] args) {
    // binary search
    int[] numsBinarySearch = {1, 2, 4, 6, 7, 9, 10, 20, 35};
    System.out.println("binary search result index: " + BinarySearch.solution(numsBinarySearch, 4));

    // quick sort
    int[] numsQuickSort = {6, 1, 2, 7, 9, 3, 2, 4, 5, 10, 6, 8};
    System.out.println("before quick sort: " + Arrays.toString(numsQuickSort));
    QuickSort.solution(numsQuickSort);
    System.out.println("after quick sort: " + Arrays.toString(numsQuickSort));

    // merge sort
    int[] numsMergeSort = {6, 1, 2, 7, 9, 3, 2, 4, 5, 10, 6, 8};
    System.out.println("before merge sort: " + Arrays.toString(numsMergeSort));
    MergeSort.solution(numsMergeSort);
    System.out.println("after merge sort: " + Arrays.toString(numsMergeSort));

    // quick select kth largest
    int[] numsQuickSelect = {5, 8, 4, 6, 1};
    int k = 1;
    System.out.println(
        "the " + k + "th largest number in " + Arrays.toString(numsQuickSelect) + " is "
            + QuickSelect.solution(numsQuickSelect, k));
  }
}
