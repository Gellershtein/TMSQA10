package lesson6.animals2;

/*
Создать класс описывающий животное Animal: имя, возраст
Создать класс описывающий кота Cat: имя, возраст, ловит ли мышей, страница в инстаграме.

Поведение(методы):
Вывод информации
Приветствие: для кота вывести meow

Создать класс описывающий собаку Dog: имя, возраст, количество команд которые знает собака
Вывод информации
Приветствие: для собаки вывести woof
Animal станет абстрактным
*/

public class RunnerAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 3, true, "@meow");
        cat1.print();
        cat1.sayHello();

        Animal dog = new Dog("Jeck", 2, 100);
        dog.print();
        dog.sayHello();
    }

}
