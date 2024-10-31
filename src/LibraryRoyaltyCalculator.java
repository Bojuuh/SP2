
public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author = new Author("Markus");
        AudioBook audioBook = new AudioBook("Audio", "SKØN", 10, 400);
        PrintedBook printedBook = new PrintedBook("Cartoon", "TE", 140, 72);
        PrintedBook printedBook2 = new PrintedBook("Novel", "LYRIK", 125, 35);

        author.addTitle(audioBook);
        author.addTitle(printedBook);
        author.addTitle(printedBook2);

        author.calculateTotalPay();
    }
}