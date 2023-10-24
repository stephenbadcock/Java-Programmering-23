public class Catalog {
    private String name;
    private Book[] catalog;
    private int count = 0;
    private String[][] libraryIndex;
    private int indexHcCount = 0;
    private int indexJiCount = 0;

    public Catalog(String name, int numberOfBooks) {
        this.name = name;
        this.catalog = new Book[numberOfBooks];
        libraryIndex = new String[2][numberOfBooks];
    }

    public String getName() {
        return name;
    }

    public void addBookToCatalog(Book book) {
        if (count < catalog.length) {
            catalog[count] = book;
        }

        count++;
    }

    public void printCatalog() {
        for (Book book : catalog) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + ", " + book.getYear());
        }

        System.out.println();
    }

    public void addToIndex(Book book, String index) {
        if (index.equals("Hc") && indexHcCount < libraryIndex[0].length) {
            libraryIndex[0][indexHcCount] = book.getTitle();

            indexHcCount++;
        } else if (index.equals("Ji") && indexJiCount < libraryIndex[1].length) {
            libraryIndex[1][indexJiCount] = book.getTitle();

            indexJiCount++;
        }
    }

    public void searchIndexesForBook(String searchedTitle) {
        String match = "";
        
        for (String title : libraryIndex[0]) {
            if (searchedTitle.equals(title) == true) {
                match = "Hc";
            }
        }

        for (String title : libraryIndex[1]) {
            if (searchedTitle.equals(title) == true) {
                match = "Ji";
            }
        }

        System.out.println(searchedTitle + " hittas i sektionen " + match);
    }
}
