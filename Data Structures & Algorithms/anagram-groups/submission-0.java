class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();

        for (String str: strs){
            int[] countArray = new int[26];
            for(char c : str.toCharArray()){
                countArray[c - 'a']++;
            }
            String key = Arrays.toString(countArray);
            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(str);
        }

        return new ArrayList<>(hashMap.values());
    }
}
