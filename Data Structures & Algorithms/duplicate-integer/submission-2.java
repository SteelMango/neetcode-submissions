class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Get String array length
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ( nums[i] == nums[j]) {
                    return true;
                } 
            }
        }
        return false;
    }
}