package dental.appointment.clinic.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "appointments")
public class Appointment {

    // put variables that an appointment may have/needs.
    // Generate UUID = Hashkey String
    // Start time = LocalDateTime
    // End time = LocalDateTime
    // Name of patient = String
    // Dentist = String
    // Description = String
    // Service = String
    // generate getters and setters put attributes on getters
    // PatientUUID = String

}
