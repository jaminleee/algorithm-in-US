class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = a + "" + b;
        int ab2 = 2*a*b;
        if( Integer.valueOf(ab) >= ab2){
            answer = Integer.valueOf(ab);
        }
        else {
            answer = ab2;
        }
        return answer;
    }
}