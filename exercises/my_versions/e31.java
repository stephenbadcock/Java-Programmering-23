public class e31 {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.printDefaults();
    }
}

class Book {
    String author = "Yo", title = "Made";
    int year = 20;

    void printDefaults () {
        System.out.println("Author = " + author + ", Title = " + title + ", year = " + year);
    }
}
