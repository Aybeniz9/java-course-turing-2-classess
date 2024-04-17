package Module02.module02.Birht;

import java.time.LocalDate;

public class Teacher extends Person {
    double maas;
    String isYeri;

    Teacher(LocalDate birthDate, String name) {
        super(birthDate, name);
    }


    @Override
    public void doHappyBirthday() {
        System.out.println(super.birthDate + "Happyy");

    }
}
