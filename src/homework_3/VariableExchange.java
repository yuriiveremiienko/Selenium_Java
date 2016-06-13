package homework_3;

/*
1) Знаешь задачу про смену значений двух переменных,
без введения третьей? Если нет, то попробуй придумать решение.
*/

public class VariableExchange {

    public static void main (String[] args) {
        int a = 1;
        int b = 3;
        System.out.println("a = " + a + " ,b = " + b);

        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " ,b = " + b);
    }
}
