package leetcode.Dp;

public class jump_game {
    public boolean canJump(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        vis[0]=true;
        for(int i = 0 ; i < nums.length ; i++){
            if(!vis[i]){
                continue;
            }
            int val = nums[i];
            for(int j = 1 ; j<=val && j+i<nums.length ; j++){
                vis[i+j]=true;
            }
        }
        return vis[nums.length-1];
    }
}
