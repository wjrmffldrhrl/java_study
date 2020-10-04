package org.example.coverage;

public class Moim {
    public int maxNumberOfAttendees;

    public int nuberOfEnrollment;

    public boolean isEnrollmentFull() {
        if (maxNumberOfAttendees == 0) {
            return false;
        }

        if (nuberOfEnrollment < maxNumberOfAttendees) {
            return false;
        }

        return true;
    }
}
