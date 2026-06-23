class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0){
            return 0;
        }

        int l =0, r = height.length - 1, res = 0;
        int leftMax = height[l], rightMax = height[r];

        while (l < r){
            if(leftMax < rightMax){
                l++;
                leftMax =  Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }

        return res;
        // int n = height.length;
        // int[] lMax = new int[n];
        // int[] rMax = new int[n];
        // int res = 0;

        // lMax[0] = height[0];
        // for(int i=1; i<n; i++){
        //     lMax[i] = Math.max(lMax[i-1],height[i]);
        // }
        
        // rMax[n-1] = height[n-1];
        // for(int i=n-2; i >= 0; i--){
        //     rMax[i] = Math.max(rMax[i+1],height[i]);
        // }

        // for(int i =0; i < n; i++){
        //     res += Math.min(lMax[i], rMax[i]) - height[i];
        // }

        // return res;
    }
}
