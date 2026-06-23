class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[] prevInterval = intervals[0];

        List<int[]> res = new ArrayList<>();
        res.add(prevInterval);

        for ( int[] interval : intervals){

            if(prevInterval[1] >= interval[0]){
                prevInterval[1] = Math.max(prevInterval[1], interval[1]);
            } else {
                prevInterval = interval;
                res.add(prevInterval);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
}
