package dental.appointment.clinic.Activity;

import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import dental.appointment.clinic.converters.AppointmentConverter;
import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.dynamodb.AppointmentDao;
import dental.appointment.clinic.exceptions.AppointmentNotFoundException;
import dental.appointment.clinic.models.requests.UpdateAppointmentRequest;
import dental.appointment.clinic.models.results.UpdateAppointmentResult;

import dental.appointment.clinic.util.PatientsUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Objects;


public class UpdateAppointmentActivity implements RequestHandler<UpdateAppointmentRequest, UpdateAppointmentResult> {
    private final Logger log = LogManager.getLogger();
    private final AppointmentDao appointmentDao;


    @Inject
    public UpdateAppointmentActivity(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    public UpdateAppointmentActivity() {
        this.appointmentDao = new AppointmentDao(new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2)));
    }

    @Override
    public UpdateAppointmentResult handleRequest(final UpdateAppointmentRequest updateAppointmentRequest, Context context) {
        log.info("Received UpdateAppointmentRequest {}", updateAppointmentRequest);

        String patientName = updateAppointmentRequest.getPatientName();
        String dentistName = updateAppointmentRequest.getDentistName();
        //sadasdasdasd
        Appointment existingAppointment = appointmentDao.getAppointment(updateAppointmentRequest.getId());
        if (existingAppointment == null) {
            throw new AppointmentNotFoundException("Appointment not found for ID: " + updateAppointmentRequest.getId());
        }

        LocalDateTime startTime = existingAppointment.getStartTime();
        LocalDateTime endTime = existingAppointment.getEndTime();
        String description = updateAppointmentRequest.getDescription();
        String service = updateAppointmentRequest.getService();
        String address = updateAppointmentRequest.getAddress();
        String contactInfo = updateAppointmentRequest.getContactInfo();

        Appointment updatedAppointment = new Appointment();

        updatedAppointment.setAppointmentId(existingAppointment.getAppointmentId());
        updatedAppointment.setStartTime(startTime);
        updatedAppointment.setEndTime(endTime);
        updatedAppointment.setPatientName(patientName);
        updatedAppointment.setPatientId(PatientsUtil.generatePatientId());
        updatedAppointment.setDentistName(dentistName);
        updatedAppointment.setDescription(description);
        updatedAppointment.setContactInfo(contactInfo);
        updatedAppointment.setAddress(address);

        updatedAppointment.setService(service);

        appointmentDao.saveAppointment(updatedAppointment);

        return UpdateAppointmentResult.builder()
                .withAppointment(new AppointmentConverter().convertToAppointmentModel(updatedAppointment))
                .build();
    }
}
