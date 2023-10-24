public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Rosens namn", "Umberto Eco", 1980);
        Book book2 = new Book("Kim", "Rudyard Kipling", 1901);
        Book book3 = new Book("Gösta Berling's Saga", "Selma Lagerlöf", 1891);
        Book book4 = new Book("The Handmaid's Tale", "Margaret Atwood", 1986);

        Catalog library = new Catalog("Mitt bibliotek", 4);

        library.addBookToCatalog(book1);
        library.addBookToCatalog(book2);
        library.addBookToCatalog(book3);
        library.addBookToCatalog(book4);

        library.addToIndex(book1, "Hc");
        library.addToIndex(book2, "Ji");
        library.addToIndex(book3, "Hc");
        library.addToIndex(book4, "Ji");

        System.out.println("Böcker i " + library.getName());
        System.out.println("-------------------------------");
        library.printCatalog();

        library.searchIndexesForBook("Rosens namn");
        library.searchIndexesForBook("Kim");
    }
}
