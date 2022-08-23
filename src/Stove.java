public class Stove {
    private String name;
    private int maxheat;
    private String stovetype;

    public Stove(String name, int maxheat, String stovetype) {
        this.name = name;
        this.maxheat = maxheat;
        this.stovetype = stovetype;
    }

    public String getName() {
        return name;
    }

    public int getMaxheat() {
        return maxheat;
    }

    public String getStovetype() {
        return stovetype;
    }
}
