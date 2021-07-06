/**
 * @author Harsh
 * IUserRegistration is a functional interface.
 *
 */

@FunctionalInterface
public interface IUserRegistration {
    public Boolean validate(String data) throws UserRegistrationException;
}
