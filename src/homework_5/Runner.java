package homework_5;

/*
* ДЗ по ООП: объявить класс Животное. Животное должно
* характеризоваться высотой, длиной, цветом и информацией
* о том, умеет ли данное животное плавать. Также оно должно
* произносить звуки. Написать 2-3 класса наследника
* (например, Лошадь, Кит, Собака)
*/

public class Runner {

    public static void main(String [] args) {

        Runner run = new Runner();

        Cat cat = new Cat();
        Cat customCat = new Cat(25, 35, "Black", "- Purrrr", true);

        run.makeSound(cat, customCat);
    }

    public void makeSound(Animal cat, Animal customCat) {
        System.out.println(cat.sound + "\n" + customCat.sound);
    }

}
