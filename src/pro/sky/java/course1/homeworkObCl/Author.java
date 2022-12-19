package pro.sky.java.course1.homeworkObCl;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toSeeFio() {
        return getName() + " " + getSurname();
    }
}


