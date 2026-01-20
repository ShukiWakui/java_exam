public class Student {
    int energy;

    Student(int energy) {
        this.energy = energy;
    }

    void sleep() {
        energy += 50;
        if (energy >= 100) {
            energy = 100;
        }
        System.out.println("寝ました。エネルギーが" + energy + "になりました。");
        if (energy == 100) {
            System.out.println("フルパワー!");
        }
    }

    void study() {
        energy -= 30;
        if (energy <= 0) {
            energy = 0;
        }
        System.out.println("勉強しました。エネルギーが" + energy + "になりました。");
        if (energy == 0) {
            System.out.println("寝てください。");
        }
    }
}
