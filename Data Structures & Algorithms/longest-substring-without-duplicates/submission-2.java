class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int i = 0, j = 0;
        Set<Character> hashSet = new HashSet<>();


        while (j < s.length()){
            while (hashSet.contains(s.charAt(j))){
                hashSet.remove(s.charAt(i));
                i++;
            }
            
                hashSet.add(s.charAt(j));
                maxLen = Math.max(maxLen, j-i+1);
                j++;
               
        }

        return maxLen;
    }
}
