package dental.appointment.clinic.Activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dental.appointment.clinic.converters.AppointmentConverter;
import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.dynamodb.models.AppointmentDao;

import dental.appointment.clinic.models.AppointmentModel;
import dental.appointment.clinic.models.requests.CreateAppointmentRequest;
import dental.appointment.clinic.models.results.CreateAppointmentResult;
import dental.appointment.clinic.util.AppointmentUtils;
import dental.appointment.clinic.util.PatientsUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Implementation of the CreateAppointmentActivity for the Dental Appointment Clinic's CreateAppointment API.
 *
 * This API allows the clinic to create a new appointment for a patient with the provided information.
 */
public class CreateAppointmentActivity implements RequestHandler<CreateAppointmentRequest, CreateAppointmentResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;

    /**
     * Instantiates a new CreateAppointmentActivity object.
     *
     * @param appointmentDao AppointmentDao to access the appointments table.
     */
    @Inject
    public CreateAppointmentActivity(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    public CreateAppointmentActivity() {
        appointmentDao = null;
    }

    /**
     * This method handles the incoming request by persisting a new appointment
     * with the provided information.
     * <p>
     * It then returns the newly created appointment.
     * <p>
     * If the provided patient name or dentist name has invalid characters, throws an
     * InvalidAttributeValueException
     *
     * @param createAppointmentRequest request object containing the appointment details
     * @return createAppointmentResult result object containing the API defined {@link Appointment}
     */
    @Override
    public CreateAppointmentResult handleRequest(final CreateAppointmentRequest createAppointmentRequest, Context context) {
        log.info("Received CreateAppointmentRequest {}", createAppointmentRequest);

        String patientName = createAppointmentRequest.getPatientName();
        String dentistName = createAppointmentRequest.getDentistName();


        String appointmentId = AppointmentUtils.generateAppointmentId();
        LocalDateTime startTime = createAppointmentRequest.getStartTime();
        LocalDateTime endTime = createAppointmentRequest.getEndTime();
        String description = createAppointmentRequest.getDescription();
        String service = createAppointmentRequest.getService();

        Appointment appointment = new Appointment();

        appointment.setAppointmentId(appointmentId);
        appointment.setStartTime(startTime);
        appointment.setEndTime(endTime);
        appointment.setPatientId(createAppointmentRequest.getPatientId());
        appointment.setPatientName(patientName);
        appointment.setDentistName(dentistName);
        appointment.setDescription(description);
        appointment.setService(service);

        appointmentDao.saveAppointment(appointment);

        return CreateAppointmentResult.builder()
                .withAppointment(new AppointmentConverter().convertToAppointmentList(appointment))
                .build();
    }
}
