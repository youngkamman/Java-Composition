public class PC {
    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp() {
        thecase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        monitor.drawPixelAt(1200,50,"yellow");
    }

}
