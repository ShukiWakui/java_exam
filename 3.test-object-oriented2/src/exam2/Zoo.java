package exam2;

public class Zoo {
    public static void main(String[] args) {
        Animal sheep = new Sheep();
        Animal horse = new Horse();
        Animal goat = new Goat();
        Animal[] animals = {sheep, horse, goat};
        for (Animal animal: animals) {
            animal.cry();
        }
    }
}
