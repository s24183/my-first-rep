public class MonitorBuilder {
    private double screenSize;
    private int Hz;
    private String processor;

    public MonitorBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;

        return  this;
    }

    public MonitorBuilder setHz(int hz) {
        Hz = hz;
        return  this;
    }

    public MonitorBuilder setProcessor(String processor) {
        this.processor = processor;
        return  this;
    }
    public Monitor getMonitor(){
        return  new Monitor(screenSize, Hz,processor);
    }
}
