import java.util.*;
public class BankAccount {
    private double balance;
    private String name;
    private int acctNum;
    Scanner input = new Scanner(System.in);

        BankAccount(double balance, String name, int acctNum) {
            this.balance = balance;
            this.name = name;
            this.acctNum = acctNum;
        }
        BankAccount(double balance, String name) {
            this.balance = balance;
            this.name = name;
        }
        BankAccount() {
           
        }
        
    public int getAcctNum() {
        return acctNum;
    }
    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void Deposit(double amount) {
        balance = amount + balance;
    }

    public void Withdraw(double amount) {
        balance = balance - amount;
    }

    public void transfer(double amount) {}

    public void Account () {
        System.out.println("Name is " + getName());
        System.out.println("current balance is " + getBalance());

    }

}
