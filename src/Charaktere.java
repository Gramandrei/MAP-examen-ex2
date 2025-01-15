import java.util.ArrayList;
import java.util.List;


public class Charaktere {
    private int id;
    private String name;
    private String herkunftsort;
    private List <Produkte> produkte;

    public Charaktere(int id, String name, String herkunftsort) {
        this.id = id;
        this.name = name;
        this.herkunftsort = herkunftsort;
        this.produkte = new ArrayList<>();


    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHerkunftsort() {
        return herkunftsort;
    }

    public Produkte getProdukte() {
        return (Produkte) produkte;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Herkunftsort: " + herkunftsort + ", Produkt: " + (Produkte)produkte;
    }

}
