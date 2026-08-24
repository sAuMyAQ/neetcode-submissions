class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0 ; i< nums.length; i++){
            hashSet.add(nums[i]);
        }

        for (int num : hashSet){
            if(!hashSet.contains(num -1)){
                int len = 1;
                while(hashSet.contains(num + len)){
                    len ++;
                }
                res = Math.max(len, res);
            }
        }

        return res;
    }
}
