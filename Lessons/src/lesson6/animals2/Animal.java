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


public abstract class Animal {
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
    public abstract void sayHello();

    public String getName() {
        return name;
    }
}
