public class Fridge {
    private String name;
    private int maxtemp;

    public Fridge(String name, int maxtemp) {
        this.name = name;
        this.maxtemp = maxtemp;
    }

    public String getName() {
        return name;
    }

    public int getMaxtemp() {
        return maxtemp;
    }
}
