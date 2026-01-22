package exam1;

public class EcoCar extends Car {
    @Override
    public void run() {
        System.out.println("シーン!" + this.getName() + "が走ります");
    }
}
