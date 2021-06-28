import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Enter first name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String pattern ="(^[A-Z])([A-Za-z]{2,})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(name);
        Boolean match = m.matches();
        if(match){
            System.out.println("It is valid");
        }
        else{
            System.out.println("Input is not valid");
        }
    }
}
