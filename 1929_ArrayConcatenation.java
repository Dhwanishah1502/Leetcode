class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int index = 0; index < nums.length; index++)
            ans[index] = ans[index + nums.length] = nums[index];
        return ans;
    }
}
