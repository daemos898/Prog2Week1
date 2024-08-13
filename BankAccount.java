public class BankAccount 
{
    //Creates the variables that the account will use such as first name, last name, account ID, and balance
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    //Constructor that sets account to 0 when first created
    public BankAccount() {
        this.balance = 0;
    }
    
    //Constructor to set the order in which the variables will take place within the account information
    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }

    //Method that will deposit money into the bank account which will add whatever number the user enters to their existing balance
    public void deposit(double amount) {
        this.balance += amount;
    }

    //Method that is the same as depositing but it is for withdrawing in which the number the user enters is subtracted from the existing balance
    public void withdrawal(double amount) {
        this.balance -= amount;
    }
    
    //Getters and setters for variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }
    
    //When account information is printed it will print in this order of name, ID, and balance
    public void accountSummary() {
        System.out.println("Account Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: " + balance);
    }
}