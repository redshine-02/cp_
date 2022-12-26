package Striver.Day2;
import java.util.*;
public class merge_sub_Inter {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b)->{
            return a[0] - b[0];
        });
        Stack<int[]> st = new Stack<>();
        st.push(intervals[0]);
        for(int i = 1 ; i<intervals.length ; i++){
            int [] a = st.peek();
            if(intervals[i][0]>=a[0] && intervals[i][0]<=a[1]){
                st.pop();
                int[] b = {a[0],Math.max(a[1],intervals[i][1])};
                st.push(b);
            }
            else{
                st.push(intervals[i]);
            }
        }
        int len = st.size();
        int[][] ans = new int[len][2];
        while(len>0){
            ans[len-1]=st.pop();
            len--;
        }
        return ans;
    }
}
