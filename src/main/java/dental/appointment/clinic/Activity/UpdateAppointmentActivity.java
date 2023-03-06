package dental.appointment.clinic.Activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import dental.appointment.clinic.converters.AppointmentConverter;
import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.dynamodb.models.AppointmentDao;
import dental.appointment.clinic.exceptions.AppointmentNotFoundException;
import dental.appointment.clinic.models.requests.UpdateAppointmentRequest;
import dental.appointment.clinic.models.results.UpdateAppointmentResult;
import dental.appointment.clinic.util.AppointmentUtils;
import dental.appointment.clinic.util.PatientsUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Implementation of the UpdateAppointmentActivity for the Dental Appointment Clinic's UpdateAppointment API.
 *
 * This API allows the clinic to update an existing appointment with the provided information.
 */
public class UpdateAppointmentActivity implements RequestHandler<UpdateAppointmentRequest, UpdateAppointmentResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;

    /**
     * Instantiates a new UpdateAppointmentActivity object.
     *
     * @param appointmentDao AppointmentDao to access the appointments table.
     */
    @Inject
    public UpdateAppointmentActivity(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    public UpdateAppointmentActivity() {
        appointmentDao = null;
    }

    /**
     * This method handles the incoming request by updating an existing appointment
     * with the provided information.
     * <p>
     * It then returns the updated appointment.
     * <p>
     * If the provided appointment ID does not exist, throws an AppointmentNotFoundException
     * If the provided patient name or dentist name has invalid characters, throws an
     * InvalidAttributeValueException
     *
     * @param updateAppointmentRequest request object containing the appointment details
     * @return updateAppointmentResult result object containing the API defined {@link Appointment}
     */
    @Override
    public UpdateAppointmentResult handleRequest(final UpdateAppointmentRequest updateAppointmentRequest, Context context) {
        log.info("Received UpdateAppointmentRequest {}", updateAppointmentRequest);

        String patientName = updateAppointmentRequest.getName();
        String dentistName = updateAppointmentRequest.getDentistName();

        Appointment existingAppointment = appointmentDao.getAppointment(updateAppointmentRequest.getId());
        if (Objects.isNull(existingAppointment)) {
            throw new AppointmentNotFoundException("Appointment not found for ID: " + updateAppointmentRequest.getId());
        }

        LocalDateTime startTime = existingAppointment.getStartTime();
        LocalDateTime endTime = existingAppointment.getEndTime();
        String description = updateAppointmentRequest.getDescription();
        String service = updateAppointmentRequest.getService();

        Appointment updatedAppointment = new Appointment();

        updatedAppointment.setAppointmentId(existingAppointment.getAppointmentId());
        updatedAppointment.setStartTime(startTime);
        updatedAppointment.setEndTime(endTime);
        updatedAppointment.setPatientId(updateAppointmentRequest.getPatientId());
        updatedAppointment.setPatientName(patientName);
        updatedAppointment.setDentistName(dentistName);
        updatedAppointment.setDescription(description);
        updatedAppointment.setService(service);

        appointmentDao.saveAppointment(updatedAppointment);

        return UpdateAppointmentResult.builder()
                .withAppointment(new AppointmentConverter().convertToAppointmentList(updatedAppointment))
                .build();
    }
}
