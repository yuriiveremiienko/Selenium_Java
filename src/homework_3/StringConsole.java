package homework_3;

/*
4) написать метод, принимающий как параметр строку и выводящий
в консоль эту строку посимвольно, каждый символ в новой строке
*/

public class StringConsole {

    String srt = "4) написать метод, принимающий как параметр строку и выводящий " +
                "в консоль эту строку посимвольно, каждый символ в новой строке";

    public static void main(String[] args) {

        StringConsole Str = new StringConsole();

        stringToConsole(Str.srt);
    }

    public static void  stringToConsole(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

}
