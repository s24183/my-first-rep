public class AirCompany implements ICompany{
public boolean haveSeats;
public String name;



    public AirCompany(boolean haveSeats, String name) {
        this.haveSeats = haveSeats;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHaveSeats() {
        return haveSeats;
    }

    @Override
    public void Assign(String name) {
        System.out.println( name + " has been added to the flight " );
    }

}
