package atm;

import java.util.ArrayList;

public class DatabaseDataSource {

    public ArrayList<Customer> getCustomerData(){
        // database จำลอง
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"ton","1234"));
        customers.add(new Customer(200,"to","2345"));
        return customers;
    }
}
