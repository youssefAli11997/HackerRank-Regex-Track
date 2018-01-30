//link: https://www.hackerrank.com/challenges/forward-references/problem
public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^(\\2tic|(tac))+$"); // Use \\ instead of using \
        // another solution (without forward references)
        tester.checker("^tac(tac(tic)?)*$"); // Use \\ instead of using \ 
    
    }
}
