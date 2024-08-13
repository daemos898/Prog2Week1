public class TestClass {
	
  public static void main(String[] args) 
  {
	  
    CheckingAccount checkAcc = new CheckingAccount("Trevor", "Atwell", 518645123, 450.0, 0.04); //Create CheckingAccount for myself
    
    //Prints relevant account information such as Name, ID, Balance, and Interest Rates
    System.out.println("Account Summary: "); 
    System.out.println("First Name: " + checkAcc.getFirstName());
    System.out.println("Last Name: " + checkAcc.getLastName());
    System.out.println("Account ID: " + checkAcc.getAccountID());
    System.out.println("Balance: $" + checkAcc.getBalance());
    System.out.println("Interest Rate: " + checkAcc.getInterestRate());
    
    //Deposits $100 to bank account making new total $550
    System.out.println("\nDepositing $100..."); 
    checkAcc.deposit(100);
    System.out.println("Balance: $" + checkAcc.getBalance());
    
    //Withdraws $600 causing account to go negative and charging $30 overdraft fee
    System.out.println("\nWithdrawling $600..."); 
    checkAcc.processWithdrawal(600);
    System.out.println("Balance: $" + checkAcc.getBalance());
    
    //Same information as the first account summary but shows the new balance in the banking account
    System.out.println("\nDisplaying account information..."); 
    checkAcc.displayAccount();
  }
}