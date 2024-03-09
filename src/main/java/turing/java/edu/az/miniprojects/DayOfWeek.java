package turing.java.edu.az.miniprojects;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATUDAY("SATUDAY"),
    SUNDAY("SUNDAY");
    private final String dayOfTheWeek;

    DayOfWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "dayOfTheWeek='" + dayOfTheWeek + '\'' +
                '}';
    }
}
