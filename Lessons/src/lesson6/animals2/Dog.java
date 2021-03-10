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
public class Dog extends Animal {
    private int numberOfCommands;

    public Dog(String name, int age, int numberOfCommands) {
        super(name, age);
        this.numberOfCommands = numberOfCommands;
    }

    @Override
    public void sayHello() {
        System.out.println(super.getName() + " 0_0 woof-woof 0_0");
    }
}
