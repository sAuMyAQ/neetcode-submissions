class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightroduct = new int[nums.length];

int n = nums.length;
        int[] res = new int[nums.length];

        leftProduct[0] = 1;

        for (int i =1; i< nums.length; i++){
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }

        rightroduct[n-1] = 1;

        for (int i =nums.length - 2; i>=0; i--){
            rightroduct[i] = rightroduct[i+1] * nums[i+1];
        }

        for (int i=0; i<nums.length; i++){
            res[i] = leftProduct[i] * rightroduct[i];
        }

        return res;
    }
}  
