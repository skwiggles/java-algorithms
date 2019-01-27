import java.util.Arrays;
import templates.BinarySearch;
import templates.Combination;
import templates.MergeSort;
import templates.Permutation;
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

    // find all combination, total number is 2^n
    int[] combinationWoDup = {1, 2, 3};
    int[] combinationWithDup = {1, 2, 2};
    System.out.println(Combination.solution(combinationWoDup));
    System.out.println(Combination.solution(combinationWithDup));

    // find all permutation, total number is n!
    int[] permutationWoDup = {1, 2, 3};
    int[] permutationWithDup = {1, 2, 2};
    System.out.println(Permutation.solution(permutationWoDup));
    System.out.println(Permutation.solution(permutationWithDup));
  }
}
