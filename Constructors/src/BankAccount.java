public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance,
                       String customerName, String customerEmail,
                       String customerPhoneNumber) {
               System.out.println("Account constructor with parameters called");
               this.accountNumber = accountNumber;
               this.accountBalance = accountBalance;
               this.customerName = customerName;
               email = customerEmail;
               phoneNumber = customerPhoneNumber;

    }


    public BankAccount(String customerName, String email,
                       String phoneNumber) {
        this("99999", 100.55, customerName,
                email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }


    public void depositFunds(double depositAmount){

        accountBalance+= depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. " +
                "New balance is $" + accountBalance);


    }
    public void withdrawFunds(double withdrawAmount){

        if (accountBalance - withdrawAmount < 0){
            System.out.println("Insuficient funds! You only have $" +
                    accountBalance + " in your account.");
        } else {

            accountBalance-=withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount +
                    " made. New balance is $" + accountBalance);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}