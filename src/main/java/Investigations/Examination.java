package Investigations;

import java.time.LocalDate;

public class Examination {

    protected LocalDate testDate;

    public Examination(int year, int month, int dayOfMonth){
        this.testDate = LocalDate.of(year, month, dayOfMonth);

    }

    public LocalDate getTestDate() {
        return testDate;
    }
}
