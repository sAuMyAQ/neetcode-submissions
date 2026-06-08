class Solution {
    public int findMin(int[] nums) {
        int left = 0; 
        int right = nums.length -1;
        int minElt = nums[0];

        while(left <= right){
            if (nums[left] < nums[right]) {
                minElt = Math.min(minElt, nums[left]);
                break;
            }
            int mid = left + (right - left)/2;

            minElt = Math.min(minElt, nums[mid]);
            if(nums[mid] >= nums[left]){
                left = mid +1;
            } else {
                right = mid -1;
            }

        }

        return minElt;
    }
}
