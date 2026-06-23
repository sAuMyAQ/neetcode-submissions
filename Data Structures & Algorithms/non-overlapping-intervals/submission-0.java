class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int res = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i<intervals.length; i++){
            int startTime = intervals[i][0];
            int endTime = intervals[i][1];

            if(startTime < prevEnd){
                res++;
            } else {
                prevEnd = endTime;
            }
        }

        return res;
    }
}
