//Create a BankAccount class using encapsulation with accountNumber,accountHolder, balance,
//deposit(), withdraw() and displayBalance()

class BankAccount{
    private int AccountNumber;
    private String AccountHolder;
    private double balance;

      BankAccount(int AccountNumber,String AccountHolder,double balance){
          this.AccountNumber=AccountNumber;
          this.AccountHolder=AccountHolder;
          this.balance=balance;
      }

      public void deposit(int amount){
          balance=amount+balance;
      }

      public void withdraw(int amount){

          if(amount>balance){
              System.out.println("Insufficient balance");
          }else{
              balance=balance-amount;
          }
      }

      public void Displaybalance(){
          System.out.println("Current Balance :"+balance);
      }
}



public class BankDetails {
    public static void main(String[] args) {

        BankAccount obj=new BankAccount(2002030203,"Ranveer",500);

        obj.deposit(100);
        obj.withdraw(50);
        obj.Displaybalance();

    }
}
