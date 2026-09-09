class Solution {
    // [ 2, 3, 1, 1, 4 ]
    public boolean canJump(int[] nums) {
        int target = nums.length -1;

        for (int i = nums.length-2; i >=0; i--){
            if (i + nums[i] >= target){
                target = i;
            }
        }

        return target == 0;
    }
}
