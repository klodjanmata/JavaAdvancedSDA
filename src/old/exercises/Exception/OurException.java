package old.exercises.Exception;

public class OurException extends RuntimeException{
    public OurException() {
    }

    public OurException(String message) {
        super(message);
    }

    public OurException(String message, Throwable cause) {
        super(message, cause);
    }

    public OurException(Throwable cause) {
        super(cause);
    }

    public OurException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
