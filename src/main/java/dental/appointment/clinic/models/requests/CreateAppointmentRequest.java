package dental.appointment.clinic.models.requests;

import dental.appointment.clinic.util.PatientsUtil;

import java.time.LocalDateTime;
import java.util.Objects;

public class CreateAppointmentRequest {
    private String patientId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String patientName;
    private String dentistName;
    private String description;
    private String service;

    public CreateAppointmentRequest(String patientId, LocalDateTime startTime, LocalDateTime endTime, String patientName,
                                    String dentistName, String description, String service) {
        this.patientId = patientId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.patientName = patientName;
        this.dentistName = dentistName;
        this.description = description;
        this.service = service;
    }

    public CreateAppointmentRequest() {
    }

    private CreateAppointmentRequest(Builder builder) {
        this.patientId = builder.patientId;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.patientName = builder.patientName;
        this.dentistName = builder.dentistName;
        this.description = builder.description;
        this.service = builder.service;
    }

    public String getPatientId() {
        return patientId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDentistName() {
        return dentistName;
    }

    public String getDescription() {
        return description;
    }

    public String getService() {
        return service;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateAppointmentRequest)) return false;
        CreateAppointmentRequest that = (CreateAppointmentRequest) o;
        return Objects.equals(getPatientId(), that.getPatientId()) && Objects.equals(getStartTime(), that.getStartTime()) && Objects.equals(getEndTime(), that.getEndTime()) && Objects.equals(getPatientName(), that.getPatientName()) && Objects.equals(getDentistName(), that.getDentistName()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getService(), that.getService());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientId(), getStartTime(), getEndTime(), getPatientName(), getDentistName(), getDescription(), getService());
    }

    @Override
    public String toString() {
        return "CreateAppointmentRequest{" +
                "patientId='" + patientId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", patientName='" + patientName + '\'' +
                ", dentistName='" + dentistName + '\'' +
                ", description='" + description + '\'' +
                ", service='" + service + '\'' +
                '}';
    }

    public static class Builder {
        private String patientId = PatientsUtil.generatePatientId();
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String patientName;
        private String dentistName;
        private String description;
        private String service;

        public Builder withStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder withEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder withPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder withDentistName(String dentistName) {
            this.dentistName = dentistName;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withservice(String service) {
            this.service = service;
            return this;
        }

        public CreateAppointmentRequest build() {
            return new CreateAppointmentRequest(this);
        }
    }
}
