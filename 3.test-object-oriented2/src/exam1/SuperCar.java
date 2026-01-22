package exam1;

public class SuperCar extends Car {
    @Override
    public void run() {
        System.out.println("ブオーン!" + this.getName() + "が走ります");
    }
}
