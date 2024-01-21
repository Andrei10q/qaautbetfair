package Homework;

public class Library {

    public static void main(String[] args) {

        Author author = new Author("Robin Sharma", "sharmar@robinsharma.com");
        Book book = new Book("5 AM Club", 2018, author, 49.99);

        System.out.println("\nBook " + book.getName () + " (" + book.getPrice() + " RON), by " + book.getAuthor().getName() + ", published in " + book.getYear());
    }
}
