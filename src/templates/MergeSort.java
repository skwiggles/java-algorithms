package templates;

public class MergeSort {

  public static void solution(int[] nums) {

    if (nums == null || nums.length == 0) {
      return;
    }

    int[] temp = new int[nums.length];
    mergeSort(nums, 0, nums.length - 1, temp);
  }

  private static void mergeSort(int[] nums, int start, int end, int[] temp) {

    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;
    mergeSort(nums, start, mid, temp);
    mergeSort(nums, mid + 1, end, temp);
    merge(nums, start, end, temp);
  }

  private static void merge(int[] nums, int start, int end, int[] temp) {

    int mid = (start + end) / 2;
    int leftIndex = start;
    int rightIndex = mid + 1;
    int tempIndex = leftIndex;

    while (leftIndex <= mid && rightIndex <= end) {

      if (nums[leftIndex] < nums[rightIndex]) {
        temp[tempIndex++] = nums[leftIndex++];
      } else {
        temp[tempIndex++] = nums[rightIndex++];
      }
    }

    while (leftIndex <= mid) {
      temp[tempIndex++] = nums[leftIndex++];
    }

    while (rightIndex <= end) {
      temp[tempIndex++] = nums[rightIndex++];
    }

    for (tempIndex = start; tempIndex <= end; tempIndex++) {
      nums[tempIndex] = temp[tempIndex];
    }
  }
}
