class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a)+String.valueOf(b);
        String ba = String.valueOf(b)+String.valueOf(a);
        if (Integer.valueOf(ab) >= Integer.valueOf(ba)){
            answer = Integer.valueOf(ab);
        }
        else{
            answer = Integer.valueOf(ba);
        }
        return answer;
    }
}