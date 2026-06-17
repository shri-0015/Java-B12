package OOPS;

public class BankingSystem {
    private int accountNum;
    private double balance;
    private String accountHolderName;

   public  BankingSystem(int a, String n){
        this.accountNum = a;
        this.accountHolderName = n;
        this.balance = 0;
    }

    public int getAccountNo(){
        return accountNum;
            }
    public String getAccountHolderName(){
       return accountHolderName;
    }
    public double getBalance(){
       return balance;
    }
    public void deposit(double deposit ){
        balance += deposit;
        System.out.println("Deposited "+deposit);
    }
    public void withdraw(double amt){
       if (amt <=balance){
           balance -=amt;
           System.out.println("Withdrawn rs:"+amt);
       }else System.out.println("Invalid Transaction");
    }
    public void getInfo(){
        System.out.println("Name: "+accountHolderName);
        System.out.println("Account Num: "+accountNum);
        System.out.println("Balance: "+balance);
    }
}
