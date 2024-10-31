

public class AudioBook extends Title{

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
        this.rate = 0.067574;
    }


    @Override
    protected double calculatePoints(){
        return (durationInMinutes * 0.5) * calculateLiteraturePoints() * copies;
    }

    @Override
    protected double calculateLiteraturePoints(){
        switch (getLiteratureType()) {
            case "BI", "TE":
                return (double) 3 /2;
            case "LYRIK":
                return (double) 6 /2;
            case "SKØN":
                return 1.7 / 2;
            case "FAG":
                return (double) 1 / 2;
            default:
                return 0;
        }
    }
}
