package pro.sky.java.course1.homeworkObCl;

public class Main {
    public static void main(String[] args) {

        Author tolkien = new Author("John Ronald Reuel", "Tolkien");
        Author jerome = new Author("Jerome", "Salinger");

        Book theCatcher = new Book("The Catcher in the Rye", jerome, 1951);
        Book lotr = new Book("The Lord Of The Rings", tolkien, 1954);

        System.out.println("Название книги: " + theCatcher.getBookName() + "\nАвтор: " + jerome.toSeeFio() + "\nГод издания: " + theCatcher.getYearOfPublishing()); //проверял

        theCatcher.setYearOfPublishing(2002);
        System.out.println("\ntheCatcher.getYearOfPublishing() = " + theCatcher.getYearOfPublishing());

        System.out.println("\nlotr.toSee() = " + lotr.toSee()); //эта проверка получше
        lotr.setYearOfPublishing(2010);
        System.out.println("\nlotr.getYearOfPublishing() = " + lotr.getYearOfPublishing());
    }
}
