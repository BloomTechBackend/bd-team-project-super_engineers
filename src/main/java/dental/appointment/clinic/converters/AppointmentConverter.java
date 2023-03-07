package dental.appointment.clinic.converters;

import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.models.AppointmentModel;

import java.util.ArrayList;
import java.util.List;

public class AppointmentConverter {

    public AppointmentModel convertToAppointment(Appointment appointment) {
        return AppointmentModel.builder()
                .withAppointmentId(appointment.getAppointmentId())
                .withStartTime(appointment.getStartTime())
                .withEndTime(appointment.getEndTime())
                .withPatientId(appointment.getPatientId())
                .withPatientName(appointment.getPatientName())
                .withDentistName(appointment.getDentistName())
                .withDescription(appointment.getDescription())
                .withService(appointment.getService())
                .build();
    }

    public List<AppointmentModel> convertToAppointmentList(List<Appointment> appointments) {
        List<AppointmentModel> appointmentModels = new ArrayList<>();
        for (Appointment appointment : appointments) {
            appointmentModels.add(convertToAppointment(appointment));
        }
        return appointmentModels;
    }
}
