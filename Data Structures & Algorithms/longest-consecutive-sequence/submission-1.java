class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for(int num : nums){
            hashSet.add(num);
        }

        int resCount = 0;

        for(int num : hashSet){
            
            if(!hashSet.contains(num-1)){
                int count = 1;
                while(hashSet.contains(num + count)){
                    count++;
                }
            resCount = Math.max(resCount, count);
            }

        }

        return resCount;
    }
}
