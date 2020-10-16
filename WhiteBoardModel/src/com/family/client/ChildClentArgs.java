package com.family.client;
import com.family.Sex;
import com.family.Child;
import java.time.LocalDate;
import java.time.Month;

class ChildClentArgs {
    public static void main(String[] args) {
        Child child = null;
        if(args.length == 1) {
            child = new Child(args[0]);
        }else if(args.length == 5) {
            Integer year = Integer.valueOf(args[2]);
            Integer day = Integer.valueOf(args[4]);
            Month month = Month.valueOf(args[3]);
            Sex sex = Sex.valueOf(args[1]);
            child = new Child(args[0], sex, LocalDate.of(year, month, day));
        }else {
            System.out.println("Child must have a name.");
            System.out.println("Possible values: Child(name), Child(name, sex, birth year, birth month, birth day");
            System.out.println("sex: BOY, GIRL, NON_BINARY");
            System.out.println("year: 2000, month: JANURARY, day: 12");
            return;
        }

        Child.setFavorite(child.getName());
        child.playBasketball();
        child.doChores();
        child.playSoccer();
        child.sneakOutOfHouse();
        System.out.println(child);
    }
}
