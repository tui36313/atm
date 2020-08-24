package atm;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount tui = new BankAccount(1,"tui","Saving");
        BankAccount tom = new BankAccount(2,"tom","checking",1000);
        tui.deposit(1000);
        tom.withdraw(200);
        System.out.println(tui);
        System.out.println(tom);
    }
}
