package templates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

  public static List<List<Integer>> solution(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    if(nums == null) {
      return results;
    }

    // needed if nums has duplicates
    Arrays.sort(nums);
    dfs(nums, new boolean[nums.length], new ArrayList<>(), results);

    return results;
  }

  private static void dfs(int[] nums, boolean[] visited, List<Integer> subsets, List<List<Integer>> results) {
    if(nums.length == subsets.size()) {
      results.add(new ArrayList<>(subsets));
      return;
    }

    for(int i = 0; i < nums.length; i++) {
      if(visited[i]) {
        continue;
      }
      // needed if nums has duplicates
      // if previous not selected first, do not select the second
      if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
        continue;
      }

      // [] => [1]
      subsets.add(nums[i]);
      visited[i] = true;
      dfs(nums, visited, subsets, results);  // backtracking
      // [1] => []
      visited[i] = false;
      subsets.remove(subsets.size() - 1);
    }
  }
}
