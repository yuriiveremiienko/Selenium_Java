package homework_5;


public class Cat extends Animal {

    public Cat() {
        super(15, 25, "White", "- Meow", true);
    }

    public Cat(int height, int length,  String color, String sound, boolean canSwim) {
        super(height, length, color, sound, canSwim);
    }
}
