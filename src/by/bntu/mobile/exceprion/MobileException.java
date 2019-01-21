package by.bntu.mobile.exceprion;

public class MobileException extends Exception {
    public MobileException() {
        super();
    }

    public MobileException(String message) {
        super(message);
    }

    public MobileException(String message, Throwable cause) {
        super(message, cause);
    }

    public MobileException(Throwable cause) {
        super(cause);
    }
}
