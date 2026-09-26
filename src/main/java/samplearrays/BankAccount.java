package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    int counter = 0;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];
    public BankAccount(String name, int startingBalance){
         this.name = name ;
         this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            currentBalance += amount;
            transactions[counter] = amount;
            counter ++ ;
            System.out.println(name + " deposited " + amount + ". New balance: " + currentBalance);
        }else{
            System.out.println("Deposit unsuccessful!");
        }
    }

    public void withdraw(double amount){
          if(amount > 0  && amount <= currentBalance){
              currentBalance -= amount;
              transactions[counter] = -amount;
              counter ++ ;
              System.out.println(name + " withdrew" + amount + ". New balance: " + currentBalance);
          }else {
              System.out.println("Withdrawal unsuccessful!");
          }
    }

    public void displayTransactions(){
         System.out.println("Transactions: ");
         for(int i = 0 ; i < counter ; i++){
             System.out.println(transactions[i]);
         }
    }

    public void displayBalance(){
       System.out.println("Current Balance : " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
