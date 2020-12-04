public class Account {
    private String accountNumber;
    private String accountType;
    private double accountBalance;

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountType(){
        return getAccountType();
    }
    public double getAccountBalance(){
        return accountBalance;
    }

    public Account( String inAccountNumber, String inAccountType, double inAccountBalance){
        accountNumber = inAccountNumber;
        accountType = inAccountType;
        accountBalance = inAccountBalance;
    }

    public void withdraw(double amount){
        accountBalance -= amount;
    }

    public void deposit (double amount){
        accountBalance += amount;
    }
    public String checkAccountBalance(){
        String Balance = "Your account balance is " + accountBalance +".";
        return Balance;
    }

}
