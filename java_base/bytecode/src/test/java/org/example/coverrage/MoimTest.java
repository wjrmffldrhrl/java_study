package org.example.coverrage;

import org.example.coverage.Moim;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoimTest {

    @Test
    public void isFull() {
        Moim moim = new Moim();
        moim.maxNumberOfAttendees = 100;
        moim.nuberOfEnrollment = 10;

        assertFalse(moim.isEnrollmentFull());
    }
}
