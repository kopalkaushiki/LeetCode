class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map= new HashMap<>();
        int sn= s.length();
        int tn= t.length();
        for(int i=0;i<sn;i++){
            char c= s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<tn;i++){
            char ch= t.charAt(i);
            if(map.containsKey(ch)){
                int newCount= map.get(ch)-1;
                if(newCount == 0) map.remove(ch);
                else map.put(ch,newCount);
            }
            else return false;
        }
        if(map.isEmpty()) return true;
        else return false;
    }
}