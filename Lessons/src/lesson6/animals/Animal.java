package lesson6.animals;
/*
Создать класс описывающий животное Animal: имя, возраст
Создать класс описывающий кота Cat: имя, возраст, ловит ли мышей, страница в инстаграме.
Поведение(методы):
Вывод информации
Приветствие: для кота вывести meow
*/
public class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
    }

    public String getName() {
        return this.name;
    }
}
