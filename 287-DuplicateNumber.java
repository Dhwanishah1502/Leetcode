// Using Hashset
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet();
        int index = 0;
            for(index = 0; index < nums.length; index++){
                if(numSet.contains(nums[index]))
                    return nums[index];
                else
                    numSet.add(nums[index]);
            }
        return 0;
    }
}

