class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 0){
            return new int[0];
        }
        
        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            int t = temperatures[i];

            while(!stack.isEmpty() && t > temperatures[stack.peek()]){
                int pair = stack.pop();
                res[pair] = i - pair;
            }

            stack.push(i);
        }

        return res;
    }
}
