import java.util.HashMap;
import java.util.Map;

public class FirstLineSupport implements  IFirstLine{
    Map <String, ICompany> com = new HashMap<>();



    @Override
    public void buyTicket(ICustomer customer) {
        for(ICompany coms : com.values() ){
            if(coms.isHaveSeats()){
                coms.Assign(customer.getName());
                customer.flight(coms.getName());
            }
        }

    }

    @Override
    public void register(ICompany company) {
        if (!com.containsKey(company.getName())) {
            com.put(company.getName(),company);
        }

    }
}
