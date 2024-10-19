package old.exercises.Exception;

public class NumberZeroExeption extends RuntimeException{
    public NumberZeroExeption() {
    }

    public NumberZeroExeption(String message) {
        super(message);
    }

    public NumberZeroExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberZeroExeption(Throwable cause) {
        super(cause);
    }

    public NumberZeroExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
