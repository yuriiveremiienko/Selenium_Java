package homework_5;


public class Turtle extends Animal {

    public Turtle() {
        super(10, 15, "Green", "***NO SOUND***", true);
    }

    public Turtle(int height, int length,  String color, String sound, boolean canSwim) {
        super(height, length, color, sound, canSwim);
    }
}
