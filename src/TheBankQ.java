class BankAccount{
    private int AccountNumber;
    private String AccountHolder;
    private double balance;

      public void deposit(int amount){

          balance=amount+balance;
      }
      public void withdraw(int amount){
          if(amount > balance) {
              System.out.println("Insufficient balance");
          }
          else{
              balance=balance-amount;
          }
      }
      public void displayBalance(){
          System.out.println("Current balance="+balance);
      }
}
public class TheBankQ {
    public static void main(String[] args) {

        BankAccount bk=new BankAccount();

        bk.deposit(100);
        bk.displayBalance();

        bk.withdraw(50);
        bk.displayBalance();

        bk.deposit(1000);
        bk.displayBalance();


    }
}

