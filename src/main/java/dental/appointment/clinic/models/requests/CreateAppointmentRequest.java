package dental.appointment.clinic.models.requests;

import dental.appointment.clinic.util.PatientsUtil;

import java.time.LocalDateTime;

public class CreateAppointmentRequest {
    String patientId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String patientName;
    private String dentistName;
    private String description;
    private String service;

    public CreateAppointmentRequest( LocalDateTime startTime, LocalDateTime endTime,
                                    String patientName, String dentistName, String description,
                                    String service) {

        this.startTime = startTime;
        this.endTime = endTime;
        this.patientName = patientName;
        this.dentistName = dentistName;
        this.description = description;
        this.service = service;
        this.patientId = PatientsUtil.generatePatientId();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }



    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
