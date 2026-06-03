class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        int res =0;
        for(int num : nums){
            hashSet.add(num);
        }
        
        for (int num : hashSet){
            if(!hashSet.contains(num-1)){
                int curr = 1;
                while(hashSet.contains(num+curr)){
                    curr++;
                }
                res = Math.max(res, curr);
            }
            
        }

        return res;

    }
}
