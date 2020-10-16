package com.family.test;

import com.family.Sex;
import com.family.Child;
import java.time.LocalDate;
import java.time.Month;

class ChildValidationTest {
    public static void main(String[] args) {
        // Too old
        Child fourthBorn = new Child("Bonnie", Sex.GIRL, LocalDate.of(1900, Month.APRIL, 17));
        // Too young
        Child fifthBorn = new Child("Grayeson", Sex.BOY, LocalDate.of(2021, Month.AUGUST, 6));
        // Just right
        Child sixthBorn = new Child("RayeLaia", Sex.GIRL, LocalDate.of(2014, Month.APRIL, 22));

        System.out.println(fourthBorn);
        System.out.println(fifthBorn);
        System.out.println(sixthBorn);
    }
}