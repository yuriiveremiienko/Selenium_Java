package homework_5;


public class Bird extends Animal {

    public Bird() {
        super(8, 4, "Brown", "- tweet-tweet!", false);
    }

    public Bird(int height, int length,  String color, String sound, boolean canSwim) {
        super(height, length, color, sound, canSwim);
    }
}
