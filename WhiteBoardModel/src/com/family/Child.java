package com.family;
import java.time.LocalDate;
import java.time.Period;
public class Child {
    private static String favorite = "";
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 125;
    private Sex sex;
    private LocalDate birthday;
    private String name;
    private int age;

    public Child(String name) {
        this.name = name;
    }
    public Child(String name, Sex sex, LocalDate birthday) {
        this(name);
        setSex(sex);
        setAge(calculateAge(birthday));
    }

    private int calculateAge(LocalDate birthday) {
        Period age = birthday.until(LocalDate.now());
        return age.getYears();
    }
    public void playBasketball() {
        System.out.println(name + " " + playSports() + " basketball");
    }

    public void playSoccer() {
        System.out.println(name + " " + playSports() + " soccer");
    }

    private String playSports() {
        boolean didWin = (int)(Math.random()*100)%2 == 0 ? true : false;
        return didWin ? "won" : "lost";
    }

    public void sneakOutOfHouse() {
        System.out.println(name + " snuck out of house.  Shhh!");
        if(isFavorite()) {
            setFavorite("");
        }
    }

    public void doChores() {
        System.out.println(name + " is busy with chores.");
        if(!isFavorite()) {
            setFavorite(name);
        }
    }

    public boolean isFavorite() {
        if(Child.favorite.equals(getName())) {
            return true;
        }
        return false;
    }

    public static void setFavorite(String name) {
        Child.favorite = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=Child.MIN_AGE && age <= Child.MAX_AGE){
            this.age = age;
        }else {
            System.out.println("Age " + age + " is invalid. It must be between: "
                    + Child.MIN_AGE + " and " + Child.MAX_AGE);
        }
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String toString() {
        return "{Child: sex: " + getSex() + " age: " + getAge()
            + " name: " + getName() + " isFavorite: " + isFavorite();
    }
}
