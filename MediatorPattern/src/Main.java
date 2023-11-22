public class Main {
    public static void main(String[] args) {
        FirstLineSupport firstLine = new FirstLineSupport();

        Customer cust1 = new Customer("Jack");
        Customer cust2 = new Customer("Jones");
        AirCompany aircoms = new AirCompany(true,"AirFrance");

        firstLine.register(aircoms);
        firstLine.buyTicket(cust1);
        firstLine.buyTicket(cust2);
    }
}
