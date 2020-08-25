package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer tui = new Customer(1,"tui","2345");
    Customer tom = new Customer(2,"tom","1234");
       System.out.println(tui);
        System.out.println(tom);
        System.out.println(tui.checkPin("2345"));
        Bank bank = new Bank("KTB",new WebServiceDataSource());
        bank.addCustomer(tui);
        bank.addCustomer(tom);
//        bank.findCustomer(1);
//        System.out.println(bank);
//        System.out.println(bank.findCustomer(1));
//        Customer c1 = bank.findCustomer(1);
//        Customer c80 = bank.findCustomer(80);
//        System.out.println(c1);
//        System.out.println(c80);
//        System.out.println(c1.getAccount().getName());

        ATM atm = new ATM(bank);
        atm.validateCustomer(1,"2345");
        atm.deposit(1000);
        System.out.println(tui);

        atm.transfer(2,200);
        System.out.println(tui);
        System.out.println(tom);

        System.out.println(bank);



    }
}
