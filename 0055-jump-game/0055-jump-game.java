class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length;
       int final_pos= n-1;
        for(int jumps=n-2; jumps>=0; jumps--){
            if(jumps + nums[jumps] >=final_pos ){
                final_pos=jumps;
            } 
        }
        return final_pos ==0;
    }
}