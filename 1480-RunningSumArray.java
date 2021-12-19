class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int index = 1; index < nums.length; index++)
            runningSum[index] = runningSum[index - 1] + nums[index];
        return runningSum;
    }
}
