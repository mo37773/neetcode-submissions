class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numsLen = nums.length;
        for(int i=0; i <numsLen;i++){
            for(int j = i + 1; j < numsLen; j++){

                    if((nums[i]+nums[j])==target){
                        return new int[]{i,j};
                    }

                }
            
        }

        return new int[0];
    }
}
