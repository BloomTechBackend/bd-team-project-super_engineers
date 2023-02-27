package dental.appointment.clinic.exceptions;

/**
 * Exception to throw when a given appointment ID is not found in the database.
 */
public class AppointmentNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 912326717789387972L;

    /**
     * Exception with no message or cause.
     */
    public AppointmentNotFoundException() {
        super();
    }

    /**
     * Exception with a message, but no cause.
     * @param message A descriptive message for this exception.
     */
    public AppointmentNotFoundException(String message) {
        super(message);
    }

    /**
     * Exception with no message, but with a cause.
     * @param cause The original throwable resulting in this exception.
     */
    public AppointmentNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * Exception with message and cause.
     * @param message A descriptive message for this exception.
     * @param cause The original throwable resulting in this exception.
     */
    public AppointmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
