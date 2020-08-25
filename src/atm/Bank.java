package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
   // private DatabaseDataSource dataSource;
   // private WebServiceDataSource dataSource;
    private DataSource dataSource;

    public Bank(String name,DataSource dataSource)
    {
        this.name = name;
       // this.customers = new ArrayList<>();
       // this.dataSource = new DatabaseDataSource();
        //this.dataSource = new WebServiceDataSource();
        this.dataSource = dataSource;
        this.customers = dataSource.getCustomerData();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public Customer findCustomer(int id){
        for(Customer element : customers){
            if(element.getId() == id){
                return element;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
