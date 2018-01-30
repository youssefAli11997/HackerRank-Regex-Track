//link: https://www.hackerrank.com/challenges/negative-lookahead/problem
public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(.)(?!\\1)"); //Use '\\' instead of '\'.
    
    }
}
