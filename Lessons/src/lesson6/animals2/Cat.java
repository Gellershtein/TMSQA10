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
public class Cat extends Animal {
    private boolean isCatchMouse;
    private String instaUrl;

    public Cat(String name, int age, boolean isCatchMouse, String instaUrl) {
        super(name, age);
        this.isCatchMouse = isCatchMouse;
        this.instaUrl = instaUrl;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("instaUrl = " + instaUrl);
        System.out.println("isCatchMouse = " + isCatchMouse);

    }

    @Override
    public void sayHello() {
        System.out.println(super.getName() + " ^_^ Meeeeooooowwwww ^_^");
    }
}
