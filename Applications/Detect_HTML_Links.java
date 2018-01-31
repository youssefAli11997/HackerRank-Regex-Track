//link: https://www.hackerrank.com/challenges/detect-html-links/problem
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Detect_HTML_Links {

    private static Pattern pattern;

    private static void detect(String code){
        Matcher matcher = pattern.matcher(code);
        while(matcher.find()){
            String link = matcher.group(1).trim();
            String text = matcher.group(2).trim();
            text = text.replaceAll("<.*?>", "");
            System.out.println(link + "," + text);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        String htmlCode = "";

        String regex_Pattern = "<a\\shref=\"(.*?)\".*?>(.*?)<\\/a>";
        pattern = Pattern.compile(regex_Pattern);

        for(int i=0; i<n; i++){
            htmlCode = in.nextLine();
            detect(htmlCode);
        }
    }
}
