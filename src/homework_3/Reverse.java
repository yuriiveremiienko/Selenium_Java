package homework_3;

/*
2) напиши метод сортирующий массив в обратном порядке
(например, было {1,2,3,4,5}, после работы метода стало {5,4,3,2,1}.
*/

import java.util.Arrays;
public class Reverse {


    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};
        System.out.println("Initial array - " + Arrays.toString(array));

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Reversed array - " + Arrays.toString(array));
    }
}
