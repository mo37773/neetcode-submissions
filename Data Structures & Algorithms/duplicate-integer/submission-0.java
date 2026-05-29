class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();        
        boolean bDuplicate = false;
        int numsLength = nums.length;


        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int setLength = set.size();
        if(numsLength!=setLength){
            bDuplicate = true;
        }



        return bDuplicate;
    }
}