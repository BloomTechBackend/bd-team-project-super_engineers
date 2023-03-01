package dental.appointment.clinic.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;
import java.util.regex.Pattern;

public final class AppointmentUtils {

    // do not instantiate
    private AppointmentUtils() {}

    public static String generatePlaylistId() {
//        return RandomStringUtils.randomAlphanumeric(PLAYLIST_ID_LENGTH);
        return UUID.randomUUID().toString();
    }
}
