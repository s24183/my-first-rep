public class IceCream {
    private String Name;
    private String flavour;
    private String extraFlavourOne;
    private String extraFlavourTwo;

    public IceCream(String name, String flavour, String extraFlavourOne, String extraFlavourTwo) {
        Name = name;
        this.flavour = flavour;
        this.extraFlavourOne = extraFlavourOne;
        this.extraFlavourTwo = extraFlavourTwo;
    }


    @Override
    public String toString() {
        return "IceCream{" +
                "Name='" + Name + '\'' +
                ", flavour='" + flavour + '\'' +
                ", extraFlavourOne='" + extraFlavourOne + '\'' +
                ", extraFlavourTwo='" + extraFlavourTwo + '\'' +
                '}';
    }
}
