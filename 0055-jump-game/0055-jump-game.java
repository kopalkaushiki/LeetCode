class Solution {
    public boolean canJump(int[] nums) {
       int final_pos= nums.length-1;
        for(int jumps=nums.length-2; jumps>=0; jumps--){
            if(jumps + nums[jumps] >=final_pos ){
                final_pos=jumps;
            } 
        }
        return final_pos ==0;
    }
}