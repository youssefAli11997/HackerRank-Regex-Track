//link: https://www.hackerrank.com/challenges/detect-html-tags/problem
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Detect_HTML_Tags {

    private static Pattern pattern;
    private static Set<String> tagSet = new TreeSet<>();

    private static void detect(String code){
        Matcher matcher = pattern.matcher(code);
        while(matcher.find()){
            String tagName = matcher.group(1).trim();
            if(tagName.length() == 0)
                continue;
            tagSet.add(tagName);
        }
    }

    private static void printTags(){
        Iterator<String> iterator = tagSet.iterator();
        int i=0;
        for(String tag : tagSet){
            if(i>0)
                System.out.print(";");
            System.out.print(tag);
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        String htmlCode = "";

        String regex_Pattern = "<\\s*(\\w*).*?>";
        pattern = Pattern.compile(regex_Pattern);

        for(int i=0; i<n; i++){
            htmlCode = in.nextLine();
            detect(htmlCode);
        }
        printTags();
    }
}
