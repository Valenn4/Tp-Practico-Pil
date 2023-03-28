package org.example;

public class DomesticRobot extends Robot implements OrdersTasks {
    @Override
    public void type() {
        System.out.println("I'm a domestic robot");
    }
    @Override
    public void move() {
        System.out.println("The robot moves normally");
    }
    public void sweep(){
        System.out.println("The robot is sweeping");
    }
    public void cook(){
        System.out.println("The robot is cooking");
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
