class Solution {
    public void moveZeroes(int[] nums) {
        int nzero=0;
        int zero=0;
            while(nzero <nums.length){
                if(nums[nzero]!=0){
                    int temp= nums[nzero];
                    nums[nzero]=nums[zero];
                    nums[zero]=temp;
                    zero++;
                }
                nzero++;
            }
    }
}
