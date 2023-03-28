package org.example;

public class Main {
    public static void main(String[] args) {
        DomesticRobot dr = new DomesticRobot();
        dr.move();
        dr.name("Valentino");
        dr.type();
        dr.cook();
        dr.sweep();
        dr.eat();

        System.out.println(" - - - - - - - - - -");

        CombatRobot cr = new CombatRobot(CombatType.AEREO);
        cr.move();
        cr.name("Jorge");
        cr.type();
        cr.fight();
        cr.backingOut();
        cr.jump();

        System.out.println(" - - - - - - - - - -");

        AnotherRobot ar = new AnotherRobot(BodyOtherTypes.PLANT);
        ar.move();
        ar.name("Carlos");
        ar.type();
        ar.sleep();
    }
}