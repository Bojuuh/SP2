import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();

    }
    public String getName(){
        return name;
    }

    public void addTitle(Title title){
        titles.add(title);
    }
    float calculateTotalPay(){
        float totalPay = 0;
        for (Title title : titles){
            totalPay += (float) title.calculateRoyalty();
        }
        System.out.printf("Total pay for %s: %.2fkr%n", getName(), totalPay);
        return totalPay;

    }
}
