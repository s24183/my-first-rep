public class Monitor{
    private double screenSize;
   private int Hz;
    private String processor;


    public Monitor(double screenSize, int hz, String processor) {
        this.screenSize = screenSize;
        this.Hz = hz;
        this.processor = processor;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "screenSize=" + screenSize +
                ", Hz=" + Hz +
                ", processor='" + processor + '\'' +
                '}';
    }
}
