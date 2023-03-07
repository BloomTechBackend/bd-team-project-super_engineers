package dental.appointment.clinic.Activity;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dental.appointment.clinic.converters.AppointmentConverter;
import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.dynamodb.AppointmentDao;
import dental.appointment.clinic.exceptions.AppointmentNotFoundException;
import dental.appointment.clinic.models.AppointmentModel;
import dental.appointment.clinic.models.requests.GetAppointmentRequest;
import dental.appointment.clinic.models.results.GetAppointmentResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;


public class GetAppointmentActivity implements RequestHandler<GetAppointmentRequest, GetAppointmentResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;

    @Inject
    public GetAppointmentActivity(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    @Override
    public GetAppointmentResult handleRequest(final GetAppointmentRequest getAppointmentRequest, Context context) {
        log.info("Received GetAppointmentRequest {}", getAppointmentRequest);
        String requestedId = getAppointmentRequest.getId();
        Appointment appointment = appointmentDao.getAppointment(requestedId);

        if (appointment == null){
            throw new AppointmentNotFoundException();
        }

        AppointmentModel appointmentModel = new AppointmentConverter().convertToAppointment(appointment);

        return GetAppointmentResult.builder()
                .withAppointment(appointmentModel)
                .build();
    }
}