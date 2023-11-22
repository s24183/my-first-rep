public class Customer implements  ICustomer{
    public String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void flight(String name) {
        System.out.println("Booked this flight on " + name);

    }

}
