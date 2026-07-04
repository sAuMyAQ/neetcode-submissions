class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord)) return 0;
        queue.add(beginWord);
        wordSet.remove(beginWord);
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            level++;
            for(int i =0; i<size; i++){
                String currentWord = queue.poll();
                if(currentWord.equals(endWord)) return level;
            

            List<String> neighs = neighbour(currentWord);

            for(String word : neighs){
                if(wordSet.contains(word)){
                    queue.add(word);
                    wordSet.remove(word);
                }
            }
            }
            
        }

        return 0;
    }

    public List<String> neighbour(String word){
        List<String> res = new ArrayList<>();
        char[] chars = word.toCharArray();

        for(int i = 0; i< chars.length; i++){
            char c = chars[i];
            for(char j = 'a'; j <= 'z'; j++){
                chars[i] = j;
                String nei = new String(chars);
                res.add(nei);
            }
            chars[i] = c;
        }

        return res;
    }
}
