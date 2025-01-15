public class Produkte {
    private String name;
    private int price;
    private String herkunftregion;

    public Produkte(String name, int price, String herkunftregion) {
        this.name = name;
        this.price = price;
        this.herkunftregion = herkunftregion;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getHerkunftregion() {
        return herkunftregion;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Herkunftsregion: " + herkunftregion;
    }
}
