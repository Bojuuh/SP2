public class PrintedBook extends Title{
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
        this.rate = 0.067574;
    }

    protected double calculatePoints(){
        return (pages * calculateLiteraturePoints() * copies);
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (getLiteratureType()) {
            case "BI":
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                return 0;
        }
    }
}
