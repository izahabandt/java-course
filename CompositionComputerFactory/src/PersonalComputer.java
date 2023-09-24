public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase compueterCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = compueterCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
private void drawLogo() {
    monitor.drawPixelAt(1200, 50, "yellow");
}
public void powerUp() {
    computerCase.pressPowerButton();
    drawLogo();
}
}
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
    // to było potrzebne do poniższego w Main class:
    //  thePC.getMonitor().drawPixelAt(10,10,"red");
    //        thePC.getMotherboard().loadProgram("Windows OS");
    //        thePC.getComputerCase().pressPowerButton();

