package dental.appointment.clinic.converters;

import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.models.results.AppointmentModel;

public class AppointmentConverter {
    /**
     * Converts a provided {@link Appointment} into an {@link AppointmentModel} representation.
     * @param appointment the appointment to convert
     * @return the converted appointment
     */
    public static AppointmentModel toAppointmentModel(Appointment appointment) {
        return AppointmentModel.builder()
                .withAppointmentUUID(appointment.getAppointmentUUID())
                .withStartTime(appointment.getStartTime())
                .withEndTime(appointment.getEndTime())
                .withPatientName(appointment.getPatientName())
                .withPatientUUID(appointment.getPatientUUID())
                .withDentistName(appointment.getDentistName())
                .withDescription(appointment.getDescription())
                .withService(appointment.getService())
                .build();
    }

    /**
     * Converts a provided {@link AppointmentModel} into an {@link Appointment} representation.
     * @param appointmentModel the appointment model to convert
     * @return the converted appointment
     */
    public static Appointment toAppointment(AppointmentModel appointmentModel) {
        Appointment appointment = new Appointment();
        appointment.setAppointmentUUID(appointmentModel.getAppointmentUUID());
        appointment.setStartTime(appointmentModel.getStartTime());
        appointment.setEndTime(appointmentModel.getEndTime());
        appointment.setPatientName(appointmentModel.getPatientName());
        appointment.setPatientUUID(appointmentModel.getPatientUUID());
        appointment.setDentistName(appointmentModel.getDentistName());
        appointment.setDescription(appointmentModel.getDescription());
        appointment.setService(appointmentModel.getService());
        return appointment;
    }
}
