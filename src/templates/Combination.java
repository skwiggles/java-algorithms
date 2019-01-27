package templates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

  public static List<List<Integer>> solution(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    if(nums == null) {
      // {} is a subset of anything
      results.add(new ArrayList<>());
      return results;
    }

    // so all subsets following ascended order
    Arrays.sort(nums);
    dfs(nums, 0, new ArrayList<>(), results);

    return results;
  }

  private static void dfs(int[] nums, int startIndex, List<Integer> subsets, List<List<Integer>> results) {

    results.add(new ArrayList<>(subsets));

    for(int i = startIndex; i < nums.length; i++) {
      // needed if nums has duplicates
      // if previous not selected first, do not select the second
      if(i > 0 && nums[i] == nums[i-1] && i > startIndex) {
        continue;
      }
      subsets.add(nums[i]);
      dfs(nums, i + 1, subsets, results);
      subsets.remove(subsets.size() - 1);
    }
  }
}
