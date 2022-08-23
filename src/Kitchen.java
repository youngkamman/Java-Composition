public class Kitchen {
    private Stove thestove;
    private Fridge thefridge;
    private Sink thesink;

    public Kitchen(Stove thestove, Fridge thefridge, Sink thesink) {
        this.thestove = thestove;
        this.thefridge = thefridge;
        this.thesink = thesink;
    }

    public Stove getThestove() {
        return thestove;
    }

    public Fridge getThefridge() {
        return thefridge;
    }

    public Sink getThesink() {
        return thesink;
    }
}
