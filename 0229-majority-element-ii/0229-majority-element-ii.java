class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int count=nums.length /3;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > count){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}