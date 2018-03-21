import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alien_Username {

    private static Pattern pattern;
    private static String name;

    private static String detect(){
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            return "VALID";
        }
        else{
            return "INVALID";
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String regex_Pattern = "^[_\\.][0-9]+[a-zA-Z]*_?$";
        pattern = Pattern.compile(regex_Pattern);

        for(int i = 0; i < n; i++){
            name = in.nextLine();
            System.out.println(detect());
        }

    }
}
