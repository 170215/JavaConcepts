package OOPS.composition;

public class Laptop {

    private float screen;
    private Processor processor;

    private String RAM;
    private String hardDrive;

    private GraphicsCard graphicscard;
    private String opticalDrive;

    private String Keyboard;

    public Laptop(float screen, Processor processor, String RAM, String hardDrive, GraphicsCard graphicscard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.RAM = RAM;
        this.hardDrive = hardDrive;
        this.graphicscard = graphicscard;
        this.opticalDrive = opticalDrive;
        Keyboard = keyboard;
    }

    public Laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.RAM = "DDR4";
        this.hardDrive = "2TB";
        this.graphicscard = new GraphicsCard();
        this.opticalDrive = "MLT Layer";
        Keyboard = "backlit";
    }



    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", RAM='" + RAM + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicscard=" + graphicscard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", Keyboard='" + Keyboard + '\'' +
                '}';
    }

    public float getScreen() {
        return screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public GraphicsCard getGraphicscard() {
        return graphicscard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getKeyboard() {
        return Keyboard;
    }

    public String gamingMode(){
        getProcessor().setFrequency("3.1GHz");
        return "success";
    }
}
