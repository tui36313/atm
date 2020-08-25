package atm;

import java.util.ArrayList;

public class DatabaseDataSource implements DataSource{

    public ArrayList<Customer> getCustomerData(){
        // database จำลอง
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(3,"ton","1234"));
        customers.add(new Customer(4,"to","2345"));
        return customers;
    }
}
