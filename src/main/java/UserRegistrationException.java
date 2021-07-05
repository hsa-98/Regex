public class UserRegistrationException extends Exception {
    ExceptionType type;
    enum ExceptionType{
        NAME_NOT_VALID,lAST_NAME_NOT_VALID,EMAIL_NOT_VALID,PASSWORD_NOT_VALID,NUMBER_NOT_VALID;
    }

    public UserRegistrationException(String message,ExceptionType type) {
       super(message);
       this.type=type;
    }
}
