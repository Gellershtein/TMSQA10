package lesson6.animals;

/*
Создать класс описывающий животное Animal: имя, возраст
Создать класс описывающий кота Cat: имя, возраст, ловит ли мышей, страница в инстаграме.
Поведение(методы):
Вывод информации
Приветствие: для кота вывести meow
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
        System.out.println("Hello " + super.getName() + " ^_^ Meeeeooooowwwww ^_^");
        super.print();

    }


}
