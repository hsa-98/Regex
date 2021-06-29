import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Enter first name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String pattern ="^[A-Z][A-Za-z]{2,}";
        userRegistration.validate(pattern,name);

        System.out.println("Enter last name");
        String lastName = sc.next();
        pattern = "^[A-Z][a-z]{2,}";
        userRegistration.validate(pattern,lastName);

        System.out.println("Enter email id");
        String email = sc.next();
        pattern = "^[a-z]{3}[a-zA-Z0-9+._-]*@[a-z]{2}[.]{1}[a-z]{2}[.]*[a-z]*$";
        userRegistration.validate(pattern,email);


    }
    public void  validate(String pattern,String data){
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher m = pattern1.matcher(data);
        Boolean matches = m.matches();
        if(matches){
            System.out.println("It is valid");
        }
        else{
            System.out.println("Input is not valid");
        }
    }
}
