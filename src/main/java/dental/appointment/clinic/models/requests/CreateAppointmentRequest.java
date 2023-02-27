package dental.appointment.clinic.models.requests;

import java.time.LocalDateTime;
import java.util.Objects;

public class CreateAppointmentRequest {
    private String customerName;
    private LocalDateTime startTime;
    private int durationMinutes;

    public CreateAppointmentRequest(String customerName, LocalDateTime startTime, int durationMinutes) {
        this.customerName = customerName;
        this.startTime = startTime;
        this.durationMinutes = durationMinutes;
    }

    public CreateAppointmentRequest() {
    }

    public CreateAppointmentRequest(Builder builder) {
        this.customerName = builder.customerName;
        this.startTime = builder.startTime;
        this.durationMinutes = builder.durationMinutes;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAppointmentRequest that = (CreateAppointmentRequest) o;
        return durationMinutes == that.durationMinutes &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, startTime, durationMinutes);
    }

    @Override
    public String toString() {
        return "CreateAppointmentRequest{" +
                "customerName='" + customerName + '\'' +
                ", startTime=" + startTime +
                ", durationMinutes=" + durationMinutes +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String customerName;
        private LocalDateTime startTime;
        private int durationMinutes;

        private Builder() {

        }

        public Builder withCustomerName(String customerNameToUse) {
            this.customerName = customerNameToUse;
            return this;
        }

        public Builder withStartTime(LocalDateTime startTimeToUse) {
            this.startTime = startTimeToUse;
            return this;
        }

        public Builder withDurationMinutes(int durationMinutesToUse) {
            this.durationMinutes = durationMinutesToUse;
            return this;
        }

        public CreateAppointmentRequest build() { return new CreateAppointmentRequest(this); }
    }
}