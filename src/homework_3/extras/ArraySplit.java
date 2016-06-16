package homework_3.extras;

/*
5. Write a script which will split number
into random size parts, but sum of these parts should be initial number.
Function input should be number to split and number of parts to split.
Example: Split 10 into 5 parts, sum of 5 numbers
after function execution is 10.
a. Generated numbers should be integer.
b. Generated numbers should be float with not more than 2 symbols after point.
*/

public class ArraySplit {

    boolean integerValues;
    int value;
    int numberOfParts;

    ArraySplit(boolean i, int v, int n) {
        integerValues = i;
        value = v;
        numberOfParts = n;
    }

    public static void main(String[] args) {

        ArraySplit arrSpl = new ArraySplit(true, 100, 10);
        arrSpl.splitArrayIntoParts(arrSpl.integerValues, arrSpl.value, arrSpl.numberOfParts);
    }

    public void splitArrayIntoParts(boolean isInteger, int value, int parts) {

        for (int i = 0; i < 20; i++) {
            System.out.println(random(0, 10, true));
        }
    }

    public float random(float min, float max, boolean isInteger) {

        if (!isInteger) {
            return (int) Math.round(Math.random()*(max - min) + min);
        }
        return (float) Math.floor((Math.random()*(max - min) + min) * 100) / 100;
    }




}
