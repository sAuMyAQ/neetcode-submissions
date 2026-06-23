/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // int n = intervals.length;
        // int[] startTimes = new int[n];
        // int[] endTimes = new int[n];

        // Arrays.sort(startTime);
        // Arrays.sort(endTime);

        // for (int i = 0; i<n; i++){
        //     startTimes[i] = intervals[i][0];
        //     endTimes[i] = intervals[i][1];
        // }

        // int l = 0, r = 0;

        // while(l < n && r < n){
        //     if(startTime[l] < endTime[r]){
        //         return false;
        //     }
        // }

        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));

        for(int i = 1; i< intervals.size(); i++){
            Interval i1 = intervals.get(i-1);
            Interval i2 = intervals.get(i);

            if(i1.end > i2.start){
                return false;
            }
        }

        return true;

    }
}
