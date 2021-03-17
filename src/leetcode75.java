public class leetcode75 {
    /*
    * 分区 分成[0,i), [i,j) [j,k) [k, nums.length -1]
    * */
    public void sortColors(int[] nums) {
        for(int i =0, j =0, k =nums.length-1; j<=k; ++j){
            if(nums[j]==0){
                nums[j] = nums[i];
                nums[i++] = 0;
            }else if(nums[j] == 2){
                nums[j--] = nums[k];
                nums[k--] = 2;
            }

        }
    }
}
