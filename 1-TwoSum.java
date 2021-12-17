class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int index_1 = 0;
        int index_2 = 0;
        for(int index1 = 0; index1 < nums.length; index1++){
            index_1 = index1;
            for(int index2 = index1+1; index2 < nums.length; index2++){
                index_2 = index2;
                if(nums[index_1] + nums[index_2] == target){
                    indices[0] = index_1;
                    indices[1] = index_2;
                    return indices;
                }
            }
        }
        return indices;
    }
}
