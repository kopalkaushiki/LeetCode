class Solution {
    public boolean isSubsequence(String s, String t) {
        int sn=s.length();
        int tn= t.length();
        if(sn==0)return true;
        //i on t 
        //j on s
        int i=0;
        int j=0;
        while(i<tn && j<sn){
            char ct= t.charAt(i);
            char cs= s.charAt(j);
            if(cs==ct){
                j++;
                i++;
            }
            else{
                i++;
                }
        }
        if(j==sn) return true;

    return false;
        
    }
}