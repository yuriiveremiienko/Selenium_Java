package homework_3.extras;

/*
1. Write a script to replace symbols in string.
Given string “abracadabra”, replace all symbols
by rule (a to b, b to c, c to a).
Result should be “bcrbabdbcrb”.
*/

public class Abracadabra {

    public static void main(String[] args) {

        String str = "abracadabra";
        char [] strArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') {
                strArray[i] = 'b';
            } else if (str.charAt(i) == 'b') {
                strArray[i] = 'c';
            } else if (str.charAt(i) == 'c') {
                strArray[i] = 'a';
            } else {
                strArray[i] = str.charAt(i);
            }
        }

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += strArray[i];
        }

        System.out.println(newStr);
    }
}
