import java.util.*;
public class BankAccountMain {
    static ArrayList<BankAccount> accounts = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
   

    // accounts.add(new BankAccount(20000,"Lucky", 1001));
    BankAccount lucky = new BankAccount(20_000,"Lucky", 10001);
    BankAccount cher = new BankAccount(200_000,"Cher", 10002);
    BankAccount lee = new BankAccount(500_000,"Lee", 10003);
   
    public static void main(String[] args) throws Exception {
        
      
        System.out.println("Hello, Welcome to the Bank of Banks");


        while (true) {
            System.out.println("Are you an existing customer? (-1 to exit)");
            System.out.println("1. Yes /n 2. No");
            int num = Integer.parseInt(input.nextLine());
    
            if(num ==1) {
                System.out.println("Welcome back, please enter account number");
                int numTwo = Integer.parseInt(input.nextLine());
    
                for(int i = 0; i < accounts.size(); i++) {
                    if (numTwo == accounts.get(i).getAcctNum()){
    
                    } else {
                        System.out.println("account does not exist");
                    }
                }
            } else if (num == 2) {
                accounts.add(new BankAccount());
                int index = accounts.size()-1;
                System.out.println("Let's make your account");
                System.out.println("Enter name");
                String name = input.nextLine();
                System.out.println("Please enter new balance");
                double balance = Double.parseDouble(input.nextLine());
                accounts.get(index).setName(name);
                accounts.get(index).setBalance(balance);
                accounts.get(index).setAcctNum(accounts.size());
                System.out.println(accounts.get(index));
                mainMenu(accounts, accounts.get(index));
            } else if ( num == -1) {
                System.out.println("Thank you, goodbye!");
                break;
            }
        }
    }  
    public static void mainMenu (ArrayList<BankAccount> accounts, BankAccount account) {

        while(true) {
            System.out.println("Hello " + account.getName());
            System.out.println("1. Check account balance");
            System.out.println("2. Make withdrawal");
            System.out.println("3. Make deposit");
            System.out.println("4. Transfer money");
            System.out.println("5. Exit");
    
            int choice = Integer.parseInt(input.nextLine());
            
            if (choice == 1) {
                System.out.println("Your balance is " + account.getBalance());
            }else if (choice == 2) {
                System.out.println("amount to withdrawal?");
                double numOne = Double.parseDouble(input.nextLine());
                account.Withdraw(numOne);
                System.out.println("Your balance is " + account.getBalance());
            }else if (choice == 3) {
                System.out.println("How much to deposit?");
                double numTwo = Double.parseDouble(input.nextLine());
                account.Deposit(numTwo);
                System.out.println("Your balance is " + account.getBalance());
            }else if (choice == 4) {
                System.out.println("Enter account number to transfer to");
                int acctId = Integer.parseInt(input.nextLine());
                    if (acctId > accounts.size()) {
                        System.out.println("wrong account number");
                    } else {
                        account = accounts.get(acctId-1);
                        System.out.println("enter amount to transfer");
                        double amountTwo = Double.parseDouble(input.nextLine());
                        account.Deposit(amountTwo);
                    }
            }else if (choice == 5) {
                System.out.println("Thank you come again");
                break;
            }
        }
    }
}


