class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hashMap.get(a) - hashMap.get(b));

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            int key = entry.getKey();
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
            
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
        
    }
}
