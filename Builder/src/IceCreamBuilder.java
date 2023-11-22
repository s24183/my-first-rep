public class IceCreamBuilder {
    private String name;
    private String flavour;
    private String extraFlavourOne;
    private String extraFlavourTwo;


    public IceCreamBuilder(String name) {
        this.name = name;
    }

    public IceCreamBuilder setFlavour(String flavour) {
        this.flavour = flavour;
        return this;
    }

    public IceCreamBuilder setExtraFlavourOne(String extraFlavourOne) {
        this.extraFlavourOne = extraFlavourOne;
        return this;
    }

    public IceCreamBuilder setExtraFlavourTwo(String extraFlavourTwo) {
        this.extraFlavourTwo = extraFlavourTwo;
        return this;
    }

    public IceCream buildIceCream(){
        return new IceCream(name,flavour, extraFlavourOne,extraFlavourTwo);
    }
}
