class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c>='A' && c<='Z' || c>='a' && c<='z'){
                count++;
            }
            if(count>0 && c==' ') break;
        }
        return count;
    }
}