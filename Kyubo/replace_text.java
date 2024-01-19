class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int length = overwrite_string.length();
         for(int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
          int j = 0;
        while(j<length){
            answer += overwrite_string.charAt(j);
            j++;
        }
        int k = j+s;
        while(k<my_string.length()){
            answer += my_string.charAt(k);
            k++;
        }
       
        return answer;
    }
}