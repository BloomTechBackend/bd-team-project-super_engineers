package dental.appointment.clinic.exceptions;

/**
 * Exception to throw when an attribute is invalid.
 */
public class InvalidAttributeException extends RuntimeException {

    private static final long serialVersionUID = 1234567890L;

    /**
     * Exception with no message or cause.
     */
    public InvalidAttributeException() {
        super();
    }

    /**
     * Exception with a message, but no cause.
     * @param message A descriptive message for this exception.
     */
    public InvalidAttributeException(String message) {
        super(message);
    }

    /**
     * Exception with no message, but with a cause.
     * @param cause The original throwable resulting in this exception.
     */
    public InvalidAttributeException(Throwable cause) {
        super(cause);
    }

    /**
     * Exception with message and cause.
     * @param message A descriptive message for this exception.
     * @param cause The original throwable resulting in this exception.
     */
    public InvalidAttributeException(String message, Throwable cause) {
        super(message, cause);
    }
}