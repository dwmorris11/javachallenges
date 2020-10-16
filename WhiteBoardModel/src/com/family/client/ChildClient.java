package com.family.client;

import com.family.Sex;
import com.family.Child;
import java.time.LocalDate;
import java.time.Month;

class ChildClient {
    public static void main(String[] args) {
        Child firstBorn = new Child("Zachary", Sex.BOY, LocalDate.of(1996, Month.JANUARY, 7));
        Child secondBorn = new Child("Emily", Sex.GIRL, LocalDate.of(2001, Month.JUNE, 5));
        Child thirdBorn = new Child("Wesley", Sex.BOY, LocalDate.of(2005, Month.MARCH, 16));


        Child.setFavorite(firstBorn.getName());
        firstBorn.playBasketball();
        secondBorn.doChores();
        secondBorn.playSoccer();
        thirdBorn.sneakOutOfHouse();
        System.out.println(firstBorn);
        System.out.println(secondBorn);
        System.out.println(thirdBorn);
    }
}
