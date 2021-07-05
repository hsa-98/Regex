import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public Boolean validateName(String data) throws UserRegistrationException {
        String pattern = "^[A-Z][A-Za-z]{2,}";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        } catch (Exception e) {
            throw new UserRegistrationException("First name is not valid", UserRegistrationException.ExceptionType.NAME_NOT_VALID);
        }
    }

    public Boolean validateLastName(String data) throws UserRegistrationException {
        String pattern = "^[A-Z][A-Za-z]{2,}";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        }
        catch (Exception e){
            throw new UserRegistrationException("Last Name is not Valid", UserRegistrationException.ExceptionType.lAST_NAME_NOT_VALID);
        }
    }

    public Boolean validateEmailId(String data) throws UserRegistrationException {
        String pattern = "[a-zA-Z]{3}[A-Za-z_0-9+-.]*@[a-z]{2}[.][a-z]{2}[.]*[a-z]{0,2}$";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        }
        catch (Exception e){
            throw new UserRegistrationException("Email ID is not valid", UserRegistrationException.ExceptionType.EMAIL_NOT_VALID);
        }

    }

    public Boolean validatePassword(String data) throws UserRegistrationException {
        String pattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&';?\\.\\(\\)]).{8,}$";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        }
        catch (Exception e){
            throw new UserRegistrationException("Password is not valid", UserRegistrationException.ExceptionType.PASSWORD_NOT_VALID);
        }

    }

    public Boolean validatePhoneNum(String data) throws UserRegistrationException {
        String pattern = "^[0-9]{2}[0-9]{10}";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        } catch (Exception e) {
            throw new UserRegistrationException("Phone Number is not valid", UserRegistrationException.ExceptionType.NUMBER_NOT_VALID);
        }
    }
}

