package e;

class Solution {
    public int solution(int N) {
        String s = Integer.toBinaryString(N);
        int cnt=0;
        int max=0;
        boolean f = false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                cnt++;
            }
            else if(s.charAt(i)=='1' && !f){
                f=true;
                cnt=0;
                continue;
            }
            else if(s.charAt(i)=='1' && cnt>max){
                max=cnt;
                cnt=0;
            }
            else
                cnt=0;
        }
        return max;
    }
}
