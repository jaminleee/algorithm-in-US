import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(char x : a.toCharArray()){
            if(Character.isLowerCase(x)){
                result += Character.toUpperCase(x);
            } else {
                result += Character.toLowerCase(x);
            }
        }
        System.out.println(result);
    }
}