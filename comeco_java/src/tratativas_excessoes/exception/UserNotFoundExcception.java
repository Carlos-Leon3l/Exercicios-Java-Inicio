package tratativas_excessoes.exception;

public class UserNotFoundExcception extends RuntimeException{
    
    public UserNotFoundExcception(final String message) {
        super(message);
    }
}
