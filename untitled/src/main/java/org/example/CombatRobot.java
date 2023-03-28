package org.example;

public class CombatRobot extends Robot implements OrdersTasks {

    private Enum<CombatType> type;

    public CombatRobot(Enum<CombatType> type) {
        this.type = type;
    }

    @Override
    public void name(String name) {
        super.name(name);
    }
    @Override
    public void type() {
        System.out.println("I'm a combat robot");
    }
    @Override
    public void move() {
        System.out.println("The robot stealthily moves towards its opponent");
    }
    public void fight(){
        System.out.println("The robot fights with its opponent");
    }
    public void backingOut(){
        System.out.println("The robot withdraws because it is losing");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void jump() {
        super.jump();
    }
}
