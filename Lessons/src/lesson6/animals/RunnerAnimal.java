package lesson6.animals;
/*
Создать класс описывающий животное Animal: имя, возраст
Создать класс описывающий кота Cat: имя, возраст, ловит ли мышей, страница в инстаграме.
Поведение(методы):
Вывод информации
Приветствие: для кота вывести meow
*/
public class RunnerAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik",3,true,"@meow");
        cat1.print();
    }

}
