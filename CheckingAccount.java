public class CheckingAccount extends BankAccount 
{
    //Private method for the interest rate
    private double interestRate;
    
    //Creates the baseline for a persons checking account which consists of name, ID, balance, and interest rate
    public CheckingAccount(String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = interestRate;
    }
    
    //This method will charge the person $30 for overdrafting their account and send a message alerting them that this happened
    public void processWithdrawal(double amount) {
        if (amount > this.getBalance()) {
            System.out.println("You have insufficient funds, a $30 overdraft fee has been charged to your account.");
            this.withdrawal(30);
            this.withdrawal(amount);
        } else {
            this.withdrawal(amount);
        }
    }
    
    //This method displays the users account information for them
    public void displayAccount() {
        System.out.println("Checking Account Information:");
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Account ID: " + this.getAccountID());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
    
    //Getter and setter for interest rates
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}