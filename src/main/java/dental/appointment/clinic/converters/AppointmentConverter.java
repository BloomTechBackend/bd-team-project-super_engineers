package dental.appointment.clinic.converters;

import dental.appointment.clinic.dynamodb.models.Appointment;
import dental.appointment.clinic.models.AppointmentModel;

import java.util.List;
import java.util.stream.Collectors;

public class AppointmentConverter {

    public static AppointmentModel convertToAppointmentModel(Appointment appointment) {
        return AppointmentModel.builder()
                .withAppointmentId(appointment.getAppointmentId())
                .withStartTime(appointment.getStartTime())
                .withEndTime(appointment.getEndTime())
                .withPatientName(appointment.getPatientName())
                .withPatientId(appointment.getPatientId())
                .withDentistName(appointment.getDentistName())
                .withDescription(appointment.getDescription())
                .withService(appointment.getService())
                .withAppointmentList(appointment.getAppointmentList())
                .build();
    }

    public static List<AppointmentModel> convertToAppointmentModelList(List<Appointment> appointments) {
        return appointments.stream()
                .map(AppointmentConverter::convertToAppointmentModel)
                .collect(Collectors.toList());
    }

    public static Appointment ToAppointment(AppointmentModel appointmentModel) {
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentModel.getAppointmentId());
        appointment.setStartTime(appointmentModel.getStartTime());
        appointment.setEndTime(appointmentModel.getEndTime());
        appointment.setPatientName(appointmentModel.getPatientName());
        appointment.setPatientId(appointmentModel.getPatientId());
        appointment.setDentistName(appointmentModel.getDentistName());
        appointment.setDescription(appointmentModel.getDescription());
        appointment.setService(appointmentModel.getService());
        appointment.setAppointmentList(appointmentModel.getAppointmentList());
        return appointment;
    }

    public static List<Appointment> convertToAppointmentList(List<AppointmentModel> appointmentModels) {
        return appointmentModels.stream()
                .map(AppointmentConverter::ToAppointment)
                .collect(Collectors.toList());
    }
}
