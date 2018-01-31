//link: https://www.hackerrank.com/challenges/find-substring/problem
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_A_Sub_Word {

    private static Pattern pattern;
    private static String[] sents;

    private static int detect(){
        int count = 0;
        for(String sent : sents){
            Matcher matcher = pattern.matcher(sent);
            while(matcher.find()){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        sents = new String[n];
        String regex_Pattern = "", subword = "";

        for(int i = 0; i< n; i++){
            sents[i] = in.nextLine();
        }

        int q = in.nextInt(); in.nextLine();

        for(int i=0; i<q; i++){
            subword = in.nextLine();
            regex_Pattern = "\\w+" + subword + "\\w+";
            pattern = Pattern.compile(regex_Pattern);
            System.out.println(detect());
        }
    }
}
