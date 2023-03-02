package dental.appointment.clinic.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;
import java.util.regex.Pattern;

public final class PatientsUtil {
    // package private for testing

    // do not instantiate
    private PatientsUtil() {}

    public static String generatePatientId() {
//        return RandomStringUtils.randomAlphanumeric(PATIENT_ID_LENGTH);
        return UUID.randomUUID().toString();
    }
}
