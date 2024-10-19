package old.exercises.Exception;

public class DublicateNumberException extends RuntimeException{
    public DublicateNumberException() {
    }

    public DublicateNumberException(String message) {
        super(message);
    }

    public DublicateNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public DublicateNumberException(Throwable cause) {
        super(cause);
    }

    public DublicateNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
