class Solution {
    public int strStr(String haystack, String needle) {
        int h= haystack.length();
        int n= needle.length();
        for(int i=0; i<h-n+1;i++){
            if(needle.charAt(0)==haystack.charAt(i)){
                if(haystack.substring(i,n+i).equals(needle)) return i;
            }
        }
        return -1;
    }
}