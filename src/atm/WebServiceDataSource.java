package atm;

import java.util.ArrayList;

public class WebServiceDataSource implements DataSource{

    public ArrayList<Customer> getCustomerData(){
        //จำลองการต่อ web service API เพื่อดึงข้อมูลลูกค้า
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(5,"ตุัย","1234"));
        customers.add(new Customer(6,"โต","2345"));
        return customers;
    }
}
