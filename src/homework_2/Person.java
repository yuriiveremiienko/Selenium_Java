package homework_2;

/*        1.Создать класс Person. В нём определить поля Имя, Фамилия, Возраст.
        Создать метод, который выводит информацию о персоне в формате:
        Мне Возраст лет, меня зовут Имя Фамилия. При выводе информации
        нужно учесть такие ограничения: Имя и Фамилия должны состоять
        больше, чем из 2-х символов, а возраст должен быть не больше 120 лет.
*/

public class Person {


    static String firstname = "Yurii";
    static String lastname = "Veremiienko";
    static int age = 27;

    public static void main(String[] args) {

        printInfo(Person.firstname, Person.lastname, Person.age);
    }

    public static void printInfo(String firstname, String lastname, int age) {

        boolean ageCheck = validateAge(age);
        boolean nameCheck = validateName(firstname, lastname);

        if (ageCheck && nameCheck) {
            String userInfo = "Im " + age + " years old, my name is " + firstname + " " + lastname + ".";
            System.out.println(userInfo);
        } else {
            System.out.println("Age or name is incorrect");
        }

    }

    public static boolean validateAge(int age) {
        if (age <= 120) {
            return true;
        }
        return false;
    }

    public static boolean validateName(String firstname, String lastname) {

        if (firstname.length() > 2 && lastname.length() > 2) {
            return true;
        }
        return false;
    }

}
