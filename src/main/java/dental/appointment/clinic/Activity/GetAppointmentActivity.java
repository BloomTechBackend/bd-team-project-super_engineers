package dental.appointment.clinic.Activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dental.appointment.clinic.converters.AppointmentConverter;
import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.dynamodb.models.AppointmentDao;
import dental.appointment.clinic.exceptions.AppointmentNotFoundException;
import dental.appointment.clinic.models.AppointmentModel;
import dental.appointment.clinic.models.requests.GetAppointmentRequest;
import dental.appointment.clinic.models.results.GetAppointmentResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

/**

 Implementation of the GetAppointmentActivity for the Dental Appointment Clinic's GetAppointment API.

 This API allows the clinic to get one of their appointments.
 */
public class GetAppointmentActivity implements RequestHandler<GetAppointmentRequest, GetAppointmentResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;

    /**

     Instantiates a new GetAppointmentActivity object.
     @param appointmentDao AppointmentDao to access the appointments table.
     */
    @Inject
    public GetAppointmentActivity(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }
    /**

     This method handles the incoming request by retrieving the appointment from the database.

     <p>
     It then returns the appointment.

     <p>
     If the appointment does not exist, this should throw an AppointmentNotFoundException.

     @param getAppointmentRequest request object containing the appointment ID

     @return getAppointmentResult result object containing the API defined {@link AppointmentModel}
     */
    @Override
    public GetAppointmentResult handleRequest(final GetAppointmentRequest getAppointmentRequest, Context context) {
        log.info("Received GetAppointmentRequest {}", getAppointmentRequest);
        String requestedId = getAppointmentRequest.getId();
        Appointment appointment = appointmentDao.getAppointment(requestedId);

        if (appointment == null){
            throw new AppointmentNotFoundException();
        }

        AppointmentModel appointmentModel = new AppointmentConverter().convertToAppointmentList(appointment);

        return GetAppointmentResult.builder()
                .withAppointment(appointmentModel)
                .build();
    }
}