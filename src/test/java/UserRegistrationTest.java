import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    Scanner sc = new Scanner(System.in);

    @Test
    void given_Invalid_Password_Returns_Exception() {
        String password = "Harsh@123";
        try {
            userRegistration.validatePassword.validate(password);
        } catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.PASSWORD_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void given_Invalid_Email_Returns_Exception() {
        String email = "harsh@bl.co";
        try {
            userRegistration.validateEmailId.validate(email);
        } catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.EMAIL_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void given_Invalid_Name_Returns_Exception() {
        String name = "Harsh";
        try {

            userRegistration.validateName.validate(name);
        } catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.NAME_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void given_Invalid_LastName_Returns_Exception() {
        String lastName = "Agrawal";
        try {
            userRegistration.validateLastName.validate(lastName);
        } catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.NAME_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void given_Invalid_Number_Returns_Exception() {
        String number = "918291871669";
        try {
            userRegistration.validatePhoneNum.validate(number);
        }
        catch (UserRegistrationException e){
            Assertions.assertTrue(UserRegistrationException.ExceptionType.NUMBER_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void checkName() {
        String name = "Harsh";
        try {
            Boolean isValid = userRegistration.validateName.validate(name);
            Assertions.assertTrue(isValid,"First Name is valid");
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkEmail() {
        String email = "harsh@bl.co";
        try {
            Boolean isValid = userRegistration.validateEmailId.validate(email);
            Assertions.assertTrue(isValid,"First Name is valid");
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkLastName() {
        String lastName = "Agrawal";
        try {
            Boolean isValid = userRegistration.validateLastName.validate(lastName);
            Assertions.assertTrue(isValid,"First Name is valid");
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkPassword() {
        String password = "Harsh@123";
        try{
            Boolean isValid = userRegistration.validatePassword.validate(password);
            Assertions.assertTrue(isValid,"Password is Valid");
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    void checkNumber() {
        String num = "918291871669";
        try {
            Boolean isValid = userRegistration.validatePhoneNum.validate(num);
            Assertions.assertTrue(isValid, "Phone num is valid");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}
