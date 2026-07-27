class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res= new ArrayList<>();
        int sn= s.length();
        int pn= p.length(); 
        int [] pCount= new int[26];
        int [] sCount= new int[26];

        for(char c: p.toCharArray()){
            pCount[c - 'a']++;
        }

        for(int i=0;i<sn;i++){
            sCount[s.charAt(i) - 'a']++;
            if(i>=pn){
                sCount[s.charAt(i - pn) - 'a']--;
            }
            if(Arrays.equals(pCount, sCount)){
                res.add(i - pn +1);
            }
        }
        return res;
    }
}