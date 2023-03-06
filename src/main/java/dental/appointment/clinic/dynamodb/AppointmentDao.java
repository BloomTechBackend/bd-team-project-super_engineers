package dental.appointment.clinic.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.exceptions.AppointmentNotFoundException;

import javax.inject.Inject;

/**
 * Accesses data for an appointment using {@link Appointment} to represent the model in DynamoDB.
 */
public class AppointmentDao {

    private final DynamoDBMapper dynamoDbMapper;

    /**
     * Instantiates an AppointmentDao object.
     *
     * @param dynamoDbMapper the {@link DynamoDBMapper} used to interact with the appointments table
     */
    @Inject
    public AppointmentDao(DynamoDBMapper dynamoDbMapper) {
        this.dynamoDbMapper = dynamoDbMapper;
    }

    /**
     * Returns the {@link Appointment} corresponding to the specified id.
     *
     * @param id the Appointment ID
     * @return the stored Appointment, or null if none was found.
     */
    public Appointment getAppointment(String id) {
        Appointment appointment = this.dynamoDbMapper.load(Appointment.class, id);

        if (appointment == null) {
            throw new AppointmentNotFoundException("Could not find appointment with id " + id);
        }

        return appointment;
    }

    /**
     * Saves the given {@link Appointment} to the database.
     *
     * @param appointment the appointment to save
     * @return the saved appointment
     */
    public Appointment saveAppointment(Appointment appointment) {
        try {
            dynamoDbMapper.save(appointment);
        } catch (Exception e) {
            System.out.println(e);
        }
        return appointment;
    }

}
