class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]) //start time of next is before end of prev, overlap = merge
            {
                //start time stays the same, end time of newInterval is updated
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
            else //disjoint = no merge
            {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
