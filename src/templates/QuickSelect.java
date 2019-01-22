package templates;

public class QuickSelect {

  public static int solution(int[] nums, int k) {

    if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
      return -1;
    }

    return quickSelect(nums, 0, nums.length - 1, nums.length - k);
  }

  private static int quickSelect(int[] nums, int start, int end, int k) {

    if (start >= end) {
      return nums[k];
    }

    int left = start;
    int right = end;
    int pivot = nums[(left + right) / 2];

    while (left <= right) {

      while (left <= right && nums[left] < pivot) {
        left++;
      }
      while (left <= right && nums[right] > pivot) {
        right--;
      }
      if (left <= right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
      }
    }

    if(k <= right) {
      return quickSelect(nums, start, right, k);
    }
    if(k >= left) {
      return quickSelect(nums, left, end, k);
    }
    return nums[k];
  }
}
