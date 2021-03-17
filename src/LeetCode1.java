import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    /*
    * 第一种采用的是hashmap
    * 其中关注getOrDeafault这个方法，使用get会空指针
    * 第二种是双指针法
    *
    * */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> have = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ind = have.getOrDefault(target - nums[i], -1);
            if (ind >= 0) {
                return new int[]{ind, i};
            }
            have.put(nums[i], i);
        }
        return null;
    }
    public int[] twoSum1(int[] nums, int target) {
        final int n = nums.length;
        int[][] p = new int[n][2];
        for(int i=0; i<n; i++){
            p[i][0] = nums[i];
            p[i][1] = i;
        }
        Arrays.sort(p, (a, b) -> a[0] - b[0]);
        for(int i =0, j = n-1;i<j;){
            final int x = p[i][0] + p[j][0];
            if(x==target){
                return new int[] {p[i][1],p[j][1]};
            }
            if(x<target){
                ++i;
            }else{
                --j;
            }
        }
        return null;
    }
}
