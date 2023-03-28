package org.example;

public class AnotherRobot extends Robot implements OrdersTasks {

    private Enum<BodyOtherTypes> type;

    public AnotherRobot(Enum<BodyOtherTypes> type) {
        this.type = type;
    }

    @Override
    public void name(String name) {
        super.name(name);
    }
    @Override
    public void type() {
        System.out.println("I'm a "+type+" robot");
    }
    @Override
    public void move() {
        switch (type.name()){
            case "ANIMAL":
                System.out.println("The robot moves on four legs.");
                break;
            case "PLANT":
                System.out.println("The robot moves with the wind");
                break;
        }
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
