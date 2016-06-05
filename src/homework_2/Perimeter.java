package homework_2;

public class Perimeter {

    public static void main(String[] args) {

        int a = 12;
        int b = 10;
        int c = 4;

        printPerimeter(a, b, c);
    }

    public static void printPerimeter(int a, int b, int c) {

        int triangle = a + b + c;
        int square = a * 4;
        int rectangle = (a + b) * 2;

        System.out.println("Perimeter of triangle is " + triangle);
        System.out.println("Perimeter of square is " + square);
        System.out.println("Perimeter of rectangle is " + rectangle);
    }



}
