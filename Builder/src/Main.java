public class Main {
    public static void main(String[] args) {
        Monitor buildMoni = new MonitorBuilder()
                .setHz(10)
                .setProcessor("fdas")
                .getMonitor();
        System.out.println(buildMoni);

        IceCream build= new IceCreamBuilder("Chocolate").setFlavour("vanilla").buildIceCream();
        System.out.println(build);


    }
}
