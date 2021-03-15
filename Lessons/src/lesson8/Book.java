package lesson8;

public class Book implements Test{
    String name;
    String title;

    public Book(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println(name+" " + title);
    }
}
