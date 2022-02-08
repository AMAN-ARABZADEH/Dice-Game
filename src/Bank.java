public class Bank {
    private String accountNumber;
    private double balance = 0;
    private String customerName = "";
    private String email = "";
    private String phoneNumber = "";

    public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public  Bank(){
        this("54367", 00.0, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void  setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void deposite(double amount){
        this.balance = this.balance + amount;
        System.out.println("Deposite of " + amount + " made. New balance = " + this.balance);
    }
    public void withdraw(double amount){
      if(this.balance - amount < 0){

          System.out.println("Only " + this.balance + " available. withdrawal not processed!");
      } else{
          this.balance = this.balance - amount;
          System.out.println("Withdrawal of  " + amount   + " processed. Remaining balance = " + this.balance);
      }
    }
}
