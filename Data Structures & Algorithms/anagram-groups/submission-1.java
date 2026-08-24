class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            String str = strs[i];

            int[] count = new int[26];

            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }

            res.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            res.get(Arrays.toString(count)).add(str);
        }

        return new ArrayList<>(res.values());
    }
}
