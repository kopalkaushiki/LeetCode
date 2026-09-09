class Solution {
    public String convertToTitle(int colN) {
        StringBuilder res= new StringBuilder();
        while(colN >0){
            int rem= (colN -1) % 26;
            res.append((char) (rem + 'A'));
            colN= (colN-1)/26;
        }
        return res.reverse().toString();
    }
}