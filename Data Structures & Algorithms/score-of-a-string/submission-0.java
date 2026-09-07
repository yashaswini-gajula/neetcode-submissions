class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++){
            int ascii=(int)s.charAt(i);
            int ascii2=(int)s.charAt(i+1);
            sum+=Math.abs(ascii-ascii2);
        }
        return sum;
    }
}